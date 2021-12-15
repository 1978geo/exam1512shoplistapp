package com.example.exam15122021ShoppingListApp.service;

import com.example.exam15122021ShoppingListApp.model.entity.Category;
import com.example.exam15122021ShoppingListApp.model.entity.CategoryName;

public interface CategoryService {

    void initCategories();

    Category findByName(CategoryName name);
}
