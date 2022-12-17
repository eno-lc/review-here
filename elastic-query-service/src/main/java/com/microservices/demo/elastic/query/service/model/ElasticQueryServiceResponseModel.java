package com.microservices.demo.elastic.query.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ElasticQueryServiceResponseModel {
    private String id;
    private Long userId;
    private String text;
    private LocalDateTime createdAt;
}
