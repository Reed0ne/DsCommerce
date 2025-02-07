package com.reed0ne.dscommerce.services;

import com.reed0ne.dscommerce.dto.OrderDTO;
import com.reed0ne.dscommerce.entities.Order;
import com.reed0ne.dscommerce.repositories.OrderRepository;
import com.reed0ne.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id){
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}
