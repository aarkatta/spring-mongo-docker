package com.microservices.project.product.entity;

import lombok.Data;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document(collection = "products")
public class Product {

    @Id
    private String id;
    private String title;
    private BigDecimal price;
    private Integer quantty;

}
