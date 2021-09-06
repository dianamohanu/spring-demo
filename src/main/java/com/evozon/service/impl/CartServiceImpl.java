package com.evozon.service.impl;

import com.evozon.model.Cart;
import com.evozon.model.Product;
import com.evozon.repository.CartRepository;
import com.evozon.repository.impl.CartRepositoryImpl;
import com.evozon.service.CartService;
import com.evozon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cartService")
public class CartServiceImpl implements CartService {

    private CartRepository cartRepository ;

    private ProductService productService ;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository, ProductService productService) {
        this.cartRepository = cartRepository;
        this.productService = productService;
    }



    public Cart get() {
        return cartRepository.get();
    }

    public void add(String productId) {
        final Product product = productService.getById(productId);
        cartRepository.add(product);
    }
}
