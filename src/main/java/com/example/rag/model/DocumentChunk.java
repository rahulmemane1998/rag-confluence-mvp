package com.example.rag.model;

import java.time.Instant;
import java.util.Map;

public class DocumentChunk {
    public String id;
    public String pageId;
    public String title;
    public String url;
    public String content;
    public float[] embedding;
    public Map<String,Object> metadata;
    public Instant lastModified;
}
