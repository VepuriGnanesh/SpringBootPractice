package com.SpringDataJpaWith.JpaRepository.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringDataJpaWith.JpaRepository.model.Product;
import com.SpringDataJpaWith.JpaRepository.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    
   //@GetMapping or RequestMapping are same
   @GetMapping("/Products")//requesting the controller to get the products
    public List<Product> getProducts()
    {
        System.out.println(service.getProducts());
        return service.getProducts();
    }
    
    @RequestMapping("/products/{prodId}")//requesting the controller to get the products by their id

    public Product getProductsById(@PathVariable int prodId)
    
    {
        System.out.println("entering into method --> "+prodId);
        return service.getProductsById(prodId);
    }

    @PostMapping("/Products")//
    //is used to read/post the data from the 
    public void addProduct(@RequestBody Product prod)
    {
        System.out.println(prod);
        service.addProduct(prod);
    }

    @PutMapping("/Products")//update data
    public void updateProduct(@RequestBody Product prod)
    {
        System.out.println(prod);
        service.updateProduct(prod);
    }

    @DeleteMapping("/Products/{prodId}")//Delete Data
    public void deleteProduct(@PathVariable int prodId)
    {
        service.deleteProduct(prodId);
    }
}

