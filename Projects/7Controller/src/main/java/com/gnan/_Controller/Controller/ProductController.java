package com.gnan._Controller.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gnan._Controller.Model.Product;
import com.gnan._Controller.Service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    
   @RequestMapping("/Products")
    public List<Product> getProducts()
    {
        return service.getProducts();
    }
    
}
