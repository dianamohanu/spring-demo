package com.evozon.repository.impl;

import com.evozon.model.Product;
import com.evozon.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
@Repository("productRepository")
public class ProductRepositoryImpl implements ProductRepository {

    private final List<Product> products = Arrays.asList(new Product("123"), new Product("456"), new Product("789"));

    public Product getById(String id) {
//        TODO: iterate products list and return the product matching id
        return products.get(0);
    }
}
