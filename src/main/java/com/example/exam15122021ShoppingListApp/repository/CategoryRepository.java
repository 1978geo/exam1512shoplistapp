package com.example.exam15122021ShoppingListApp.repository;

import com.example.exam15122021ShoppingListApp.model.entity.Category;
import com.example.exam15122021ShoppingListApp.model.entity.CategoryName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByName(CategoryName name);
}
