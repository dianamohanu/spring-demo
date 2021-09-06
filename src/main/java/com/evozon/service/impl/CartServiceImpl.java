package com.evozon.service.impl;

import com.evozon.model.Cart;
import com.evozon.model.Product;
import com.evozon.repository.CartRepository;
import com.evozon.repository.impl.CartRepositoryImpl;
import com.evozon.service.CartService;
import com.evozon.service.ProductService;

public class CartServiceImpl implements CartService {

    private CartRepository cartRepository = new CartRepositoryImpl();

    private ProductService productService = new ProductServiceImpl();

    public Cart get() {
        return cartRepository.get();
    }

    public void add(String productId) {
        final Product product = productService.getById(productId);
        cartRepository.add(product);
    }
}
