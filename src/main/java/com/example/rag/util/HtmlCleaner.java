package com.example.rag.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.ArrayList;
import java.util.List;

public class HtmlCleaner {
    public static String toText(String html) {
        Document doc = Jsoup.parse(html);
        return doc.text();
    }

    // naive chunk by maxChars with overlap
    public static List<String> chunkText(String text, int maxChars, int overlap) {
        List<String> chunks = new ArrayList<>();
        int start = 0;
        if (text == null) return chunks;
        while (start < text.length()) {
            int end = Math.min(text.length(), start + maxChars);
            chunks.add(text.substring(start, end));
            start = Math.max(end - overlap, end);
        }
        return chunks;
    }
}
