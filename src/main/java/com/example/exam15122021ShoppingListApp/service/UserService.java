package com.example.exam15122021ShoppingListApp.service;


import com.example.exam15122021ShoppingListApp.model.service.UserServiceModel;

public interface UserService {
    boolean register(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);
}

