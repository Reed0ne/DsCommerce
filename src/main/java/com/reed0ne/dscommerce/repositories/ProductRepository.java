package com.reed0ne.dscommerce.repositories;

import com.reed0ne.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
