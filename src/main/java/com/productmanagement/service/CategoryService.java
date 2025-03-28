package com.productmanagement.service;


import com.productmanagement.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

            List<Category> getAllCategories();
            Optional<Category> getCatgoriesbyid(Long id);
            Category saveCategory(Category category);
            void deleteCategory(Long id);

}
