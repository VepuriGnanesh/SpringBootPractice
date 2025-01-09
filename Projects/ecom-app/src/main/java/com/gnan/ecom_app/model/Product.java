package com.gnan.ecom_app.model;

import java.math.BigDecimal;
import java.sql.Date;
//import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// import jakarta.persistence.Entity;

// @Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    //@Id
    private int id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releasdate;
    private boolean available;
    private int quantity;

}
