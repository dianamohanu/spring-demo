package com.evozon.service.impl;

import com.evozon.model.Product;
import com.evozon.repository.ProductRepository;
import com.evozon.repository.impl.ProductRepositoryImpl;
import com.evozon.service.ProductService;

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public Product getById(String id) {
        return productRepository.getById(id);
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
