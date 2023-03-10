package com.microservices.demo.elastic.query.web.client.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ElasticQueryWebClientRequestModel {
    private String id;

    @NotEmpty
    private String text;
}
