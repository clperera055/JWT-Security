package com.springsecurity.jwtsecurity.controller;

import com.springsecurity.jwtsecurity.entity.User;
import com.springsecurity.jwtsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register-new-user")
    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }

    @PostConstruct
    public void initRoleAndUser(){
        userService.initRoleAndUser();
    }

    @GetMapping("for-admin")
    public String forAdmin(){
        return "This URL is only accessible to admin....";
    }

    @GetMapping("for-user")
    public String forUser(){
        return "This URL is only accessible to user....";
    }
}
