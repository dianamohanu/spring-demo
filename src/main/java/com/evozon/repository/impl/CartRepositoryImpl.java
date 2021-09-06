package com.evozon.repository.impl;

import com.evozon.model.Cart;
import com.evozon.model.Product;
import com.evozon.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartRepositoryImpl implements CartRepository {

    private final Cart cart;

    @Autowired
    public CartRepositoryImpl(Cart cart) {
        this.cart = cart;
    }

    public Cart get() {
        return cart;
    }

    public void add(Product product) {
        cart.getProducts().add(product);
    }
}
