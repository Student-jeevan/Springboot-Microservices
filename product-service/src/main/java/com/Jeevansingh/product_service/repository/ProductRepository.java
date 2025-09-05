package com.Jeevansingh.product_service.repository;

import com.Jeevansingh.product_service.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ProductRepository extends MongoRepository<Product, String> {
}
