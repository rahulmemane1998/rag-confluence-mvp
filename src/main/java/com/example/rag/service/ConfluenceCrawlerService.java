package com.example.rag.service;

import com.example.rag.model.DocumentChunk;
import com.example.rag.util.HtmlCleaner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriUtils;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@ConditionalOnProperty(name = "confluence.email")
@ConditionalOnBean(VectorStoreService.class)
public class ConfluenceCrawlerService
{

    private final WebClient webClient;
    private final VectorStoreService vectorStoreService;
    private final String baseUrl;

    public ConfluenceCrawlerService(@Value("${confluence.base-url}") String baseUrl,
                                    @Value("${confluence.email}") String email,
                                    @Value("${confluence.api-token}") String apiToken,
                                    VectorStoreService vectorStoreService) {
        this.baseUrl = baseUrl;
        String auth = java.util.Base64.getEncoder().encodeToString((email + ":" + apiToken).getBytes());
        this.webClient = WebClient.builder()
                .baseUrl(baseUrl)
                .defaultHeaders(h -> {
                    h.set("Authorization", "Basic " + auth);
                    h.set("Accept", "application/json");
                })
                .build();
        this.vectorStoreService = vectorStoreService;
    }

    // Simple page search -> ingest. In production use paging + incremental.
    public void ingestByCql(String cql) {
        String url = "/rest/api/search?cql=" + UriUtils.encode(cql, StandardCharsets.UTF_8) + "&limit=50&expand=content.body.storage,content.version";
        Map resp = webClient.get().uri(url).retrieve().bodyToMono(Map.class).block();
        if (resp == null) return;
        List results = (List)resp.get("results");
        if (results == null) return;
        for (Object r : results) {
            Map res = (Map) r;
            Map content = (Map)res.get("content");
            if (content == null) continue;
            String pageId = String.valueOf(content.get("id"));
            String title = String.valueOf(content.get("title"));
            Map body = (Map)((Map)content.get("body")).get("storage");
            String html = (String)body.get("value");
            String text = HtmlCleaner.toText(html);
            List<String> chunks = HtmlCleaner.chunkText(text, 3000, 600);
            for (String chunk : chunks) {
                DocumentChunk dc = new DocumentChunk();
                dc.id = UUID.randomUUID().toString();
                dc.pageId = pageId;
                dc.title = title;
                dc.url = String.format("%s/pages/%s", baseUrl, pageId);
                dc.content = chunk;
                dc.lastModified = Instant.now();
                vectorStoreService.upsertDocumentChunk(dc);
            }
        }
    }
}
