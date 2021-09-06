package com.evozon.repository;

import com.evozon.model.Cart;
import com.evozon.model.Product;

public interface CartRepository {

    Cart get();

    void add(Product product);
}
