package com.example.ProductManagement.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.ProductManagement.Model.Products;
import com.example.ProductManagement.Repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepo;
     
    // Display all products
    public ResponseEntity<?> getAllProducts() {
        // Implementation to fetch all products
        return ResponseEntity.ok(productRepo.findAll());
    }

    // Add a new product
    public ResponseEntity<?> addProduct(Products products) {
        return ResponseEntity.ok(productRepo.save(products));
    }
}