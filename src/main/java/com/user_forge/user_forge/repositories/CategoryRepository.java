package com.user_forge.user_forge.repositories;

import com.user_forge.user_forge.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
