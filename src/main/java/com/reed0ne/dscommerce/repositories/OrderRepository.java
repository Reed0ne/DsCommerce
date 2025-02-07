package com.reed0ne.dscommerce.repositories;

import com.reed0ne.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
