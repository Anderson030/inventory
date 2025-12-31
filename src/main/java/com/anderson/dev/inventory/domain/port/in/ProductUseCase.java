package com.anderson.dev.inventory.domain.port.in;

import com.anderson.dev.inventory.domain.model.Product;
import java.util.List;

public interface ProductUseCase {

    Product createProduct(Product product);
    List<Product> getAllProducts();
}
