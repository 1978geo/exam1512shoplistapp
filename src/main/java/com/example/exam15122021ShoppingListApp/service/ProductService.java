package com.example.exam15122021ShoppingListApp.service;


import com.example.exam15122021ShoppingListApp.model.entity.CategoryName;
import com.example.exam15122021ShoppingListApp.model.service.ProductServiceModel;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    boolean add(ProductServiceModel productServiceModel);

    BigDecimal getTotalPrice();

    List<ProductServiceModel> getAllByCategoryName(CategoryName categoryName);

    void buyById(Long id);

    void buyAll();
}

