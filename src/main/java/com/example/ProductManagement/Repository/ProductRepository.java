package com.example.ProductManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProductManagement.Model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {
    
    
}