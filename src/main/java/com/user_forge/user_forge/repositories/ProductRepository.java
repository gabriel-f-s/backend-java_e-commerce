package com.user_forge.user_forge.repositories;

import com.user_forge.user_forge.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
