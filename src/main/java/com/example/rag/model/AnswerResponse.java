package com.example.rag.model;

import java.util.List;

public class AnswerResponse {
    public String answer;
    public List<DocumentChunk> sources;
    public AnswerResponse() {}
    public AnswerResponse(String a, List<DocumentChunk> s) { this.answer = a; this.sources = s; }
    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }
    public List<DocumentChunk> getSources() { return sources; }
    public void setSources(List<DocumentChunk> sources) { this.sources = sources; }
}
