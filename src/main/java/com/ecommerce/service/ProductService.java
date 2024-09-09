package com.ecommerce.service;

import com.ecommerce.entity.Product;
import com.ecommerce.payload.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO addProduct(ProductDTO productDTO);

    ProductDTO deleteProduct(int productId);

    ProductDTO updateProduct(ProductDTO productDTO);

    List<ProductDTO> getAllProducts();

    ProductDTO getProductById(int productId);


}
