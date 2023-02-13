package com.oursecurity.services;

import com.oursecurity.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("abc","abc@gmail.com","abc"));
        list.add(new User("xyz","xyz@gmail.com","xyz"));
    }

    public List<User> getAllUser(){
        return this.list;
    }

    public User getUserByUsername(String username){
        return this.list.stream().filter(data-> data.getUsername().equalsIgnoreCase(username)).findFirst().orElse(null);
    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }

}
