package com.example.rag.controller;

import com.example.rag.model.AskRequest;
import com.example.rag.model.AnswerResponse;
import com.example.rag.model.DocumentChunk;
import com.example.rag.service.EmbeddingService;
import com.example.rag.service.LlmService;
import com.example.rag.service.VectorStoreService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@ConditionalOnBean(VectorStoreService.class)
public class RagController {

    private final EmbeddingService embeddingService;
    private final VectorStoreService vectorStore;
    private final LlmService llm;

    public RagController(EmbeddingService embeddingService, VectorStoreService vectorStore, LlmService llm) {
        this.embeddingService = embeddingService;
        this.vectorStore = vectorStore;
        this.llm = llm;
    }

    @PostMapping("/ask")
    public AnswerResponse ask(@RequestBody AskRequest req) {
        float[] qEmb = embeddingService.embed(req.getQuestion());
        List<DocumentChunk> docs = vectorStore.query(qEmb, req.getTopK());
        List<DocumentChunk> selected = docs.stream().limit(4).collect(Collectors.toList());
        String ans = llm.generateAnswer(req.getQuestion(), selected);
        return new AnswerResponse(ans, selected);
    }
}
