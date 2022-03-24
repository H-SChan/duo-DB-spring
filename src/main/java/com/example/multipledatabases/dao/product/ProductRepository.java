package com.example.multipledatabases.dao.product;

import com.example.multipledatabases.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
