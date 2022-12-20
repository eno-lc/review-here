package com.microservices.demo.config;

import lombok.Data;

@Data
public class Query {
    private String method;
    private String accept;
    private String uri;
}
