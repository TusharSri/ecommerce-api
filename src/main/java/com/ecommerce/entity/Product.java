package com.ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int productId;

    @Column(name = "productName", nullable = false)
    String productName;

    @Column(name = "productDescription", nullable = false)
    String productDescription;

    @Column(name = "productPrice", nullable = false)
    int productPrice;

    @Column(name = "productQuantity", nullable = false)
    int productQuantity;

}
