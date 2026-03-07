package com.example.pc_build_dio.controller;

import com.example.pc_build_dio.entity.User;
import com.example.pc_build_dio.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// controller para receber as requisições dos usuários

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

}