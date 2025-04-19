package com.akshay.user.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.akshay.user.models.User;


@Service
public class UserService {
    
    public  List<User> userList=new ArrayList<>();

    public UserService() {
       
        userList.add(new User(UUID.randomUUID().toString(), "Akshay","Akshay@gmail.com"));
		userList.add(new User( UUID.randomUUID().toString(), "John","john@gmail.com"));
		userList.add(new User(UUID.randomUUID().toString(), "Sarah", "sarah@gmail.com"));
    }

    public List<User>getUsers(){
        return this.userList;
    }
}
