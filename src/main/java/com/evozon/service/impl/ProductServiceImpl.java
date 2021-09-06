package com.evozon.service.impl;

import com.evozon.model.Product;
import com.evozon.repository.ProductRepository;
import com.evozon.repository.impl.ProductRepositoryImpl;
import com.evozon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product getById(String id) {
        return productRepository.getById(id);
    }
}
