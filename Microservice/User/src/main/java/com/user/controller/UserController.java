package com.user.controller;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/")
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{userId}")
    public Optional<User> findUserById(@PathVariable("userId") Long userId){
        return userService.findUserById(userId);
    }

    @PutMapping("/")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/")
    public void deleteUser(@RequestBody Long userId){
        userService.deleteUser(userId);
    }
}
