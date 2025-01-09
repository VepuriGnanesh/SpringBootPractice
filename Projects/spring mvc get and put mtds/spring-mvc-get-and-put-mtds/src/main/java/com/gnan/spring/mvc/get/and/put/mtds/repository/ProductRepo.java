package com.gnan.spring.mvc.get.and.put.mtds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gnan.spring.mvc.get.and.put.mtds.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}
