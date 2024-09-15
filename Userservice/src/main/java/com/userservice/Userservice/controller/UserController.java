package com.userservice.Userservice.controller;

import com.userservice.Userservice.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private Userservice userservice;

    @PostMapping("/register/{username}")
    public void registerUser(@PathVariable String username) {
        userservice.register(username);
    }

}