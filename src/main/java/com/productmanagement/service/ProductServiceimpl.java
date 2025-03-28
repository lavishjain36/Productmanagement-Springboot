package com.productmanagement.service;

import com.productmanagement.entity.Product;
import com.productmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceimpl implements  ProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> getAllproducts() {
        return productRepository.findAll();

    }

    public Optional<Product> getproductsbyid(Long id) {
            return productRepository.findById(id);
    }

    public Product saveproduct(Product product) {

        return productRepository.save(product);

    }

    @Override
    public void deleteproduct(Long id) {
         productRepository.deleteById(id);
    }
}
