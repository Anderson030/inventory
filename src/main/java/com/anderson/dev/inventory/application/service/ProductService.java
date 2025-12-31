package com.anderson.dev.inventory.application.service;

import com.anderson.dev.inventory.domain.model.Product;
import com.anderson.dev.inventory.domain.port.in.ProductUseCase;
import com.anderson.dev.inventory.domain.port.out.ProductRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductUseCase {

    private final ProductRepositoryPort repository;

    public ProductService(ProductRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}
