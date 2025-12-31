package com.anderson.dev.inventory.domain.model;

import java.math.BigDecimal;

public class Product {

    private Long id;
    private String name;
    private String category;
    private int stock;
    private BigDecimal price;

    public Product(Long id, String name, String category, int stock, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.price = price;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public int getStock() { return stock; }
    public BigDecimal getPrice() { return price; }
}
