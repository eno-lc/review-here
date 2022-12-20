package com.microservices.demo.config;

import lombok.Data;

@Data
public class WebClient {
    private Integer connectTimeoutMs;
    private Integer readTimeoutMs;
    private Integer writeTimeoutMs;
    private Integer maxInMemorySize;
    private String contentType;
    private String acceptType;
    private String baseUrl;
}
