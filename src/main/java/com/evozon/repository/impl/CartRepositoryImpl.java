package com.evozon.repository.impl;

import com.evozon.model.Cart;
import com.evozon.model.Product;
import com.evozon.repository.CartRepository;

public class CartRepositoryImpl implements CartRepository {

    private final Cart cart = new Cart();

    public Cart get() {
        return cart;
    }

    public void add(Product product) {
        cart.getProducts().add(product);
    }
}
