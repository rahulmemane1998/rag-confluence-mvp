package com.example.rag.service;

import com.example.rag.model.DocumentChunk;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.*;

@Service
@ConditionalOnBean(JdbcTemplate.class)
public class VectorStoreService
{
    private final EmbeddingService embeddingService;
    private final JdbcTemplate jdbc;
    private final ObjectMapper mapper = new ObjectMapper();

    public VectorStoreService(EmbeddingService embeddingService, JdbcTemplate jdbc) {
        this.embeddingService = embeddingService;
        this.jdbc = jdbc;
    }

    public void upsertDocumentChunk(DocumentChunk dc) {
        try {
            float[] emb = embeddingService.embed(dc.content);
            dc.embedding = emb;
            String vectorLiteral = vectorLiteral(emb);
            String sql = "INSERT INTO docs (id, page_id, title, url, content, embedding, metadata, last_modified) " +
                    "VALUES (?::uuid,?,?,?,?," + vectorLiteral + "::vector,?,?) " +
                    "ON CONFLICT (id) DO UPDATE SET content = EXCLUDED.content, embedding = EXCLUDED.embedding, last_modified=EXCLUDED.last_modified";
            jdbc.update(conn -> {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, dc.id);
                ps.setString(2, dc.pageId);
                ps.setString(3, dc.title);
                ps.setString(4, dc.url);
                ps.setString(5, dc.content);
                try {
                    ps.setString(6, dc.metadata == null ? "{}" : mapper.writeValueAsString(dc.metadata));
                } catch (Exception e) {
                    ps.setString(6, "{}");
                }
                ps.setTimestamp(7, Timestamp.from(dc.lastModified == null ? Instant.now() : dc.lastModified));
                return ps;
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private String vectorLiteral(float[] v) {
        StringBuilder sb = new StringBuilder();
        sb.append("'[");
        for (int i=0;i<v.length;i++){
            sb.append(v[i]);
            if (i < v.length -1) sb.append(",");
        }
        sb.append("]'");
        return sb.toString();
    }

    public List<DocumentChunk> query(float[] qEmbedding, int topK) {
        List<DocumentChunk> out = new ArrayList<>();
        if (qEmbedding == null || qEmbedding.length == 0) return out;
        StringBuilder arr = new StringBuilder("'[");
        for (int i=0;i<qEmbedding.length;i++) {
            arr.append(qEmbedding[i]);
            if (i < qEmbedding.length-1) arr.append(",");
        }
        arr.append("]'::vector");
        String sql = "SELECT id, page_id, title, url, content, metadata, last_modified FROM docs ORDER BY embedding <-> " + arr + " LIMIT ?";
        out = jdbc.query(sql, ps -> ps.setInt(1, topK), (rs, rn) -> {
            DocumentChunk d = new DocumentChunk();
            d.id = rs.getString("id");
            d.pageId = rs.getString("page_id");
            d.title = rs.getString("title");
            d.url = rs.getString("url");
            d.content = rs.getString("content");
            try {
                d.metadata = mapper.readValue(rs.getString("metadata"), Map.class);
            } catch (Exception e) {
                d.metadata = Map.of();
            }
            d.lastModified = rs.getTimestamp("last_modified") == null ? null : rs.getTimestamp("last_modified").toInstant();
            return d;
        });
        return out;
    }
}
