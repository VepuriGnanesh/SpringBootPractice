package com.gnan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gnan.model.Product;
import com.gnan.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    
   @RequestMapping("/Products")//requesting the controller to get the products 
    public List<Product> getProducts()
    {
        return service.getProducts();
    }
    
    // @RequestMapping("/products/{prodId}")
    // public Product getProductsById(@PathVariable final int prodId)
    // {
    //     return service.getProductsById(prodId);
    // }
}
