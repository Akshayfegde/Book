package com.akshay.user.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.user.models.User;
import com.akshay.user.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/home")
public class Homecontroller {
    
    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> getUser(){
        return userService.getUsers();
    }
}
