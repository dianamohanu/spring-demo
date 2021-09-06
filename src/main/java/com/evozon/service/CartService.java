package com.evozon.service;

import com.evozon.model.Cart;

public interface CartService {

    Cart get();

    void add(String productId);
}
