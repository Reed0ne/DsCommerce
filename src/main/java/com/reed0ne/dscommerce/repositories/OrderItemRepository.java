package com.reed0ne.dscommerce.repositories;

import com.reed0ne.dscommerce.entities.OrderItem;
import com.reed0ne.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
