package com.example.rag.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.List;
import java.util.Map;

@Service
public class EmbeddingService {
    private final WebClient client;
    private final String model;

    public EmbeddingService(@Value("${openai.api-key}") String apiKey,
                            @Value("${openai.embeddings-model}") String model) {
        this.client = WebClient.builder()
                .baseUrl("https://api.openai.com/v1")
                .defaultHeader("Authorization", "Bearer " + apiKey)
                .build();
        this.model = model;
    }

    public float[] embed(String text) {
        Map<String,Object> body = Map.of("model", model, "input", text);
        Map resp = client.post()
                .uri("/embeddings")
                .bodyValue(body)
                .retrieve()
                .bodyToMono(Map.class)
                .block();
        if (resp == null) return new float[0];
        List data = (List)resp.get("data");
        if (data == null || data.isEmpty()) return new float[0];
        Map first = (Map)data.get(0);
        List numbers = (List)first.get("embedding");
        float[] arr = new float[numbers.size()];
        for (int i=0;i<numbers.size();i++) arr[i] = ((Number)numbers.get(i)).floatValue();
        return arr;
    }
}
