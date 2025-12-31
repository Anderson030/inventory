package com.anderson.dev.inventory.domain.port.out;

import com.anderson.dev.inventory.domain.model.Product;
import java.util.List;

public interface ProductRepositoryPort {

    Product save(Product product);
    List<Product> findAll();
}
