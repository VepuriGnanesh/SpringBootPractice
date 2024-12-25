package com.gnan.spring.mvc.get.and.put.mtds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gnan.spring.mvc.get.and.put.mtds.model.Product;
import com.gnan.spring.mvc.get.and.put.mtds.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    
   //@GetMapping or RequestMapping are same
   @GetMapping("/Products")//requesting the controller to get the products
    public List<Product> getProducts()
    {
        return service.getProducts();
    }
    
    @RequestMapping("/products/{prodId}")//requesting the controller to get the products by their id

    public Product getProductsById(@PathVariable int prodId)
    
    {
        System.out.println("entering into method --> "+prodId);
        return service.getProductsById(prodId);
    }

    @PostMapping("/Products")
    public void addProduct(@RequestBody Product prod)
    {
        System.out.println(prod);
        service.addProduct(prod);
    }
}
