package com.evozon.config;

import com.evozon.repository.CartRepository;
import com.evozon.repository.ProductRepository;
import com.evozon.repository.impl.CartRepositoryImpl;
import com.evozon.repository.impl.ProductRepositoryImpl;
import com.evozon.service.impl.CartServiceImpl;
import com.evozon.service.impl.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean(name = "cartRepository")
    CartRepository getCartRepository() {
        return new CartRepositoryImpl();

    }

    @Bean(name = "productRepository")
    ProductRepository getProductRepository() {
        return new ProductRepositoryImpl();
    }

    @Bean(name = "productService")
    ProductServiceImpl getProductService() {
        return new ProductServiceImpl(getProductRepository());
    }

    @Bean(name = "cartService")
    CartServiceImpl getCartService() {
        return new CartServiceImpl(getCartRepository(), getProductService());
    }
}
