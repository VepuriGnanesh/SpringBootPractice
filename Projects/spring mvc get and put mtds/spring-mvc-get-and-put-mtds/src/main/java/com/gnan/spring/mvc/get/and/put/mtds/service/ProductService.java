package com.gnan.spring.mvc.get.and.put.mtds.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.gnan.spring.mvc.get.and.put.mtds.model.*;
@Service
public class ProductService {

    List<Product> products=new ArrayList<>(Arrays.asList(
        new Product(101,"ipone",150000),
        new Product(102,"samsumg s22",12000),
        new Product(103,"Hayabusa",5000000)));

    public List<Product> getProducts()
    {
            return products;
    }

    // public Product getProductsById(int prodId)
    // {
    //     return products.stream()
    //                    .filter(p->p.getProdId()==prodId)
    //                    .findFirst().orElse(new Product(100,"No Item",0));//.get();
    // }
     // public Product getProductsById(int prodId)
    // {
    //     return products.stream()
    //                    .filter(p->p.equals(((Product) products).getProdId()))
    //                    .findAny()
    //                    .orElse(null) ;
    // }
    public Product getProductsById(int prodId) {
        return products.stream()
                       .filter(p -> p.getProdId() == prodId) // Compare prodId of each product
                       .findAny() // Return the first match
                       .orElse(null); // Return null if no match is found
    }
    

    public void addProduct( Product prod)
    {
        products.add(prod);
    }
}
