package com.SpringDataJpaWith.JpaRepository.service;

// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringDataJpaWith.JpaRepository.model.*;
import com.SpringDataJpaWith.JpaRepository.repository.ProductRepo;
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // List<Product> products=new ArrayList<>(Arrays.asList(
    //     new Product(101,"ipone",150000),
    //     new Product(102,"samsumg s22",12000),
    //     new Product(103,"Hayabusa",5000000)));

    public List<Product> getProducts()
    {
        //return products;
        return repo.findAll();
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
    public Product getProductsById(int prodId) {//Read data

        return repo.findById(prodId).orElse(new Product());
        // return products.stream()
        //                .filter(p -> p.getProdId() == prodId) // Compare prodId of each product
        //                .findAny() // Return the first match
        //                .orElse(null); // Return null if no match is found
    }
    

    public void addProduct( Product prod)
    {
        // products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod)//put data
    {
        // int index=0;
        // for(int i=0;i<products.size();i++)
        //     if(products.get(i).getProdId()==prod.getProdId())
        //         index = i;
        // products.set(index, prod);
        repo.save(prod);//save and update will be same
        
    }

    public void deleteProduct(int prodId)//Delete data
    {
        // int index=0;
        // for(int i=0;i<products.size();i++)
        //     if(products.get(i).getProdId()==prodId)
        //         index = i;
        // products.remove(index);
        repo.deleteById(prodId);
    }
}
