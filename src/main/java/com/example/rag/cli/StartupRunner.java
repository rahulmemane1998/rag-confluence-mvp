package com.example.rag.cli;

import com.example.rag.service.ConfluenceCrawlerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(ConfluenceCrawlerService.class)
public class StartupRunner implements CommandLineRunner {
    private final ConfluenceCrawlerService crawler;

    public StartupRunner(ConfluenceCrawlerService crawler) {
        this.crawler = crawler;
    }

    @Override
    public void run(String... args) throws Exception {
        // Uncomment for first-run ingestion (or call /ingest endpoint separately)
         crawler.ingestByCql("space = YOURSPACE");
    }
}
