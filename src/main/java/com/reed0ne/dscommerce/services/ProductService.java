package com.reed0ne.dscommerce.services;

import com.reed0ne.dscommerce.dto.ProductDTO;
import com.reed0ne.dscommerce.entities.Product;
import com.reed0ne.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }
}
