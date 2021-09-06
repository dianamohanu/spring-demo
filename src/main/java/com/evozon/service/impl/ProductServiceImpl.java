package com.evozon.service.impl;

import com.evozon.model.Product;
import com.evozon.repository.ProductRepository;
import com.evozon.repository.impl.ProductRepositoryImpl;
import com.evozon.service.ProductService;

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getById(String id) {
        return productRepository.getById(id);
    }
}
