package com.microservices.project.dataaccess;

import com.microservices.project.product.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends MongoRepository<Product, String> {
}
