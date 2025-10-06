package com.example.ProductManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProductManagement.Model.Products;
import com.example.ProductManagement.Service.ProductService;

@RestController
@CrossOrigin(origins = "*")
public class ProductController {


    @Autowired 
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<?> getAllProducts() {
        // Call the service layer to get all products
        return productService.getAllProducts();
    }

    @PostMapping("/products")
    public ResponseEntity<?> addProduct(@RequestBody Products product) {
        // Call the service layer to add a new product
        return productService.addProduct(product);
    }
    
}