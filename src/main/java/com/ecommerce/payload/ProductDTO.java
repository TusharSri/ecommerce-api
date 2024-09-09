package com.ecommerce.payload;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
//TODO: Add checks for null, not empty and size in future
public class ProductDTO {
    int productId;
    String productName;
    String productDescription;
    int productPrice;
    int productQuantity;
}
