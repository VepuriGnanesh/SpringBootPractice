package com.SpringDataJpaWith.JpaRepository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringDataJpaWith.JpaRepository.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}
