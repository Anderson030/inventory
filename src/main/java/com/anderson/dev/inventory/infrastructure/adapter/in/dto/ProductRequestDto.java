package com.anderson.dev.inventory.infrastructure.adapter.in.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class ProductRequestDto {

    @NotBlank
    private String name;

    @NotBlank
    private String category;

    @Min(0)
    private int stock;

    @NotNull
    @Min(0)
    private BigDecimal price;

    // getters y setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
}
