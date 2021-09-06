package com.evozon.service.impl;

import com.evozon.model.Cart;
import com.evozon.model.Product;
import com.evozon.repository.CartRepository;
import com.evozon.service.CartService;
import com.evozon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cartService")
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductService productService;

    public Cart get() {
        return cartRepository.get();
    }

    public void add(String productId) {
        final Product product = productService.getById(productId);
        cartRepository.add(product);
    }
}
