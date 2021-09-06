package com.evozon.repository;

import com.evozon.model.Product;

public interface ProductRepository {

    Product getById(String id);
}
