package com.ecommerce.service.impl;

import com.ecommerce.entity.Product;
import com.ecommerce.payload.ProductDTO;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private ModelMapper modelMapper;

    public ProductServiceImpl(ProductRepository productRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        Product product = modelMapper.map(productDTO, Product.class);
        Product addedproduct = productRepository.save(product);
        ProductDTO addedproductDTO = modelMapper.map(addedproduct, ProductDTO.class);
        return addedproductDTO;
    }

    @Override
    public ProductDTO deleteProduct(int productId) {
        return null;
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return null;
    }

    @Override
    public ProductDTO getProductById(int productId) {
        return null;
    }
}
