package com.bookstore.client.configs;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class DebugConfig {

    @Value("${spring.sleuth.otel.exporter.otlp.endpoint}")
    private String otlpEndpoint;

    @PostConstruct
    public void init() {
        log.info("OTLP Endpoint: " + otlpEndpoint);
    }
}