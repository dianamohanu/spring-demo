package com.evozon.service.impl;

import com.evozon.model.Product;
import com.evozon.repository.ProductRepository;
import com.evozon.service.ProductService;

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository ProductRepository) {
        this.productRepository = ProductRepository;
    }
    public ProductServiceImpl() {
    }


    public Product getById(String id) {
        return productRepository.getById(id);
    }
}
