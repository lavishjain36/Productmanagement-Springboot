package com.productmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(nullable = false)
    private  String name;

    private String description;

    private  Double price;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private  Category category;
}
