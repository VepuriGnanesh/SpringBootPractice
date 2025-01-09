package com.gnan.Ecom_Proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gnan.Ecom_Proj.model.Product;
import com.gnan.Ecom_Proj.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProducts()
    {
        return repo.findAll();
        
    }
}
