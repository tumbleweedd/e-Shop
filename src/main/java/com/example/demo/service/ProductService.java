package com.example.demo.service;

import com.example.demo.dto.ProductDTO;
import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAll();

    void addProduct(ProductDTO productDTO);

    void addToUserBucket(Long productId, String username);
}
