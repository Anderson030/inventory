package com.anderson.dev.inventory.infrastructure.adapter.in;

import com.anderson.dev.inventory.domain.model.Product;
import com.anderson.dev.inventory.domain.port.in.ProductUseCase;
import com.anderson.dev.inventory.infrastructure.adapter.in.dto.ProductRequestDto;
import com.anderson.dev.inventory.infrastructure.adapter.in.dto.ProductResponseDto;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductUseCase productUseCase;

    public ProductController(ProductUseCase productUseCase) {
        this.productUseCase = productUseCase;
    }

    @PostMapping
    public ProductResponseDto create(@Valid @RequestBody ProductRequestDto dto) {

        Product product = new Product(
                null,
                dto.getName(),
                dto.getCategory(),
                dto.getStock(),
                dto.getPrice()
        );

        Product saved = productUseCase.createProduct(product);

        return new ProductResponseDto(
                saved.getId(),
                saved.getName(),
                saved.getCategory(),
                saved.getStock(),
                saved.getPrice()
        );
    }

    @GetMapping
    public List<ProductResponseDto> list() {
        return productUseCase.getAllProducts()
                .stream()
                .map(p -> new ProductResponseDto(
                        p.getId(),
                        p.getName(),
                        p.getCategory(),
                        p.getStock(),
                        p.getPrice()
                ))
                .toList();
    }
}
