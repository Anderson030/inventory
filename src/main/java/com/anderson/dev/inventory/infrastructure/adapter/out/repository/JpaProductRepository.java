package com.anderson.dev.inventory.infrastructure.adapter.out.repository;

import com.anderson.dev.inventory.infrastructure.adapter.out.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<ProductEntity, Long> {
}
