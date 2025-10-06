package com.example.ProductManagement.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ProductManagement.Model.Products;



@Controller
@CrossOrigin(origins = "*")
public class PageController {
    
    @GetMapping("/")
    public String home() {
        return "index"; 
    }


    // @GetMapping("/view-products")
    // public String viewProducts() {
    //     return "view-products"; 
    // }

    // @GetMapping("/add-product")
    // public String addProductPage() {
    //     return "AddProduct";  
    // }

    private List<Products> products = new ArrayList<>();

    @GetMapping("/get-products")
    public List<Products> getAllProducts() {
        return products;
    }

    @PostMapping("/add-product")
    public Products addProduct(@RequestBody Products product) {
        products.add(product);
        return product;
    }
}