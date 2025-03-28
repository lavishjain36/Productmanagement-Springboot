package com.productmanagement.service;


import com.productmanagement.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllproducts();
    void getproductsbyid(Long id);
    Product saveproduct(Product product);
    void deleteproduct(Long id);
}
