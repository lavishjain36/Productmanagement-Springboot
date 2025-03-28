package com.productmanagement.service;


import com.productmanagement.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> getAllproducts();
    Optional<Product> getproductsbyid(Long id);
    Product saveproduct(Product product);
    void deleteproduct(Long id);
}
