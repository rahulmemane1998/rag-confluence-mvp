package com.example.rag.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Conditionally enable DataSource auto-configuration only when database connection is configured.
 * This allows the application to start without a database connection.
 * 
 * To enable database: 
 * - Set SPRING_DATASOURCE_URL environment variable (must be non-empty), OR
 * - Set PG_HOST environment variable (will auto-construct URL from PG_HOST, PG_PORT, PG_DB)
 */
@Configuration
@ConditionalOnProperty(name = "spring.datasource.url", matchIfMissing = false, havingValue = ".+")
@Import(DataSourceAutoConfiguration.class)
public class DatabaseConfig {
    // This configuration will only be loaded if spring.datasource.url is set and not empty
    // OR if PG_HOST is set (which will be used to construct the URL in application.yml)
}

