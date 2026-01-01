package com.example.rag.model;

public class AskRequest {
    public String question;
    public int topK = 8;

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }
    public int getTopK() { return topK; }
    public void setTopK(int topK) { this.topK = topK; }
}
