package com.anderson.dev.inventory.infrastructure.adapter.in.dto;

import java.math.BigDecimal;

public class ProductResponseDto {

    private Long id;
    private String name;
    private String category;
    private int stock;
    private BigDecimal price;

    public ProductResponseDto(Long id, String name, String category, int stock, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.price = price;
    }

    // getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public int getStock() { return stock; }
    public BigDecimal getPrice() { return price; }
}
