package com.example.rag.service;

import com.example.rag.model.DocumentChunk;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class LlmService {
    private final WebClient client;
    private final String model;

    public LlmService(@Value("${openai.api-key}") String apiKey,
                      @Value("${openai.llm-model}") String model) {
        this.client = WebClient.builder()
                .baseUrl("https://api.openai.com/v1")
                .defaultHeader("Authorization", "Bearer " + apiKey)
                .build();
        this.model = model;
    }

    public String generateAnswer(String question, List<DocumentChunk> docs) {
        StringBuilder sb = new StringBuilder();
        sb.append("You are an assistant. Use ONLY the following documents to answer the question. If answer not present, say 'I don't know' and list the most relevant links.\n\n");
        sb.append("Question: ").append(question).append("\n\n");
        int idx=1;
        for (DocumentChunk d : docs) {
            sb.append("SOURCE ").append(idx++).append(" Title: ").append(d.title).append(" URL: ").append(d.url).append("\n");
            sb.append(d.content).append("\n\n");
        }
        sb.append("Answer concisely and add source links in square brackets.\n");

        Map<String,Object> body = Map.of(
            "model", model,
            "messages", List.of(Map.of("role","user","content", sb.toString())),
            "temperature", 0.0
        );

        Map resp = client.post().uri("/chat/completions").bodyValue(body).retrieve().bodyToMono(Map.class).block();
        if (resp == null) return "";
        List choices = (List)resp.get("choices");
        if (choices == null || choices.isEmpty()) return "";
        Map first = (Map)choices.get(0);
        Map message = (Map)first.get("message");
        return (String)message.get("content");
    }
}
