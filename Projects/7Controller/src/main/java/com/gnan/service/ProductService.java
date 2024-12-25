package com.gnan.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gnan.model.*;
@Service
public class ProductService {

    List<Product> products=Arrays.asList(
        new Product(101,"ipone",150000),
        new Product(102,"samsumg s22",12000));

    public List<Product> getProducts()
    {
            return products;
    }

    // public Product getProductsById(int prodId)
    // {
    //     return products.stream()
    //                    .filter(p->p.getProductsById()==prodId)
    //                    .findFirst().get();
    // }
    
}
