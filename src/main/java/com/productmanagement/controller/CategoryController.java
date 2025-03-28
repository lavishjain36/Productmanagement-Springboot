package com.productmanagement.controller;


import com.productmanagement.entity.Category;
import com.productmanagement.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCatgories(){
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategorybyid(@PathVariable Long id){
        return categoryService.getCatgoriesbyid(id);
    }


    @PostMapping
    public Category createcatgory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }


    @DeleteMapping
    public void deletecategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }
}
