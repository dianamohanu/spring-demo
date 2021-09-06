package com.evozon.config;

import com.evozon.repository.CartRepository;
import com.evozon.repository.ProductRepository;
import com.evozon.repository.impl.CartRepositoryImpl;
import com.evozon.repository.impl.ProductRepositoryImpl;
import com.evozon.service.CartService;
import com.evozon.service.ProductService;
import com.evozon.service.impl.CartServiceImpl;
import com.evozon.service.impl.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    CartRepository cartRepository() {
        return new CartRepositoryImpl();
    }

    @Bean
    ProductRepository productRepository() {
        return new ProductRepositoryImpl();
    }

    @Bean
    ProductService productService() {
        return new ProductServiceImpl(productRepository());
    }

    @Bean
    CartService cartService() {
        return new CartServiceImpl(cartRepository(), productService());
    }

}
