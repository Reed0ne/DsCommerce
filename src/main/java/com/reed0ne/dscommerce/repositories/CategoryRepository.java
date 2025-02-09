package com.reed0ne.dscommerce.repositories;

import com.reed0ne.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
