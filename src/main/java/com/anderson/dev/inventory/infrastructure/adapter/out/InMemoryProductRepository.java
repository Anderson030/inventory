package com.anderson.dev.inventory.infrastructure.adapter.out;

import com.anderson.dev.inventory.domain.model.Product;
import com.anderson.dev.inventory.domain.port.out.ProductRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryProductRepository implements ProductRepositoryPort {

    private final List<Product> products = new ArrayList<>();

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
}
