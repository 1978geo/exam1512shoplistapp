package com.example.exam15122021ShoppingListApp.init;

import com.example.exam15122021ShoppingListApp.repository.CategoryRepository;
import com.example.exam15122021ShoppingListApp.service.CategoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Datainit implements CommandLineRunner {

    private final CategoryService categoryService;
    private final CategoryRepository categoryRepository;


    public Datainit(CategoryService categoryService, CategoryRepository categoryRepository) {
        this.categoryService = categoryService;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (categoryRepository.count() == 0) {
            categoryService.initCategories();
        }
    }
}
