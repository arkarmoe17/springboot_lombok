package com.arkarmoe.springboot_lombok.controller;

import com.arkarmoe.springboot_lombok.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/hello")
    public User helloUser(){
      User user = new User("arkar","moe","arkarmoe@gmail.com");
      return user;
    }
}
