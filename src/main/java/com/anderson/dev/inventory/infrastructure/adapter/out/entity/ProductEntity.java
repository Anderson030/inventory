package com.anderson.dev.inventory.infrastructure.adapter.out.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private int stock;
    private BigDecimal price;

    protected ProductEntity() {}

    public ProductEntity(String name, String category, int stock, BigDecimal price) {
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
