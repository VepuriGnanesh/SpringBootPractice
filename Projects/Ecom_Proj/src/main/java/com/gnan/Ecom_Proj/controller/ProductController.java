package com.gnan.Ecom_Proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gnan.Ecom_Proj.model.Product;
import com.gnan.Ecom_Proj.service.ProductService;

@RestController
// @CrossOrigin
@RequestMapping("/api")
public class ProductController {
    
    @Autowired
    private ProductService service;
    
    @RequestMapping("/")
    public String greet()
    {
        return "Hello World";
    }
    @GetMapping("/Products")
    public List<Product> getAllProducts()
    {
        return service.getAllProducts();
    }
}
