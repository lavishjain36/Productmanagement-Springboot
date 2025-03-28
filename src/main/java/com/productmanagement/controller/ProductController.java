package com.productmanagement.controller;


import com.productmanagement.entity.Product;
import com.productmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllproducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> getCategorybyid(@PathVariable Long id){
        return productService.getproductsbyid(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return  productService.saveproduct(product);
    }

    @DeleteMapping
    public void deleteProduct(@PathVariable Long id){
        productService.deleteproduct(id);
    }
}
