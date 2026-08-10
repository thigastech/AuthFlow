package com.thigastech.authflow.controller;

import com.thigastech.authflow.model.User;
import com.thigastech.authflow.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String userDashboard() {
        return "user";
    }

    @GetMapping("/users")
    @ResponseBody
    public List<User> users() {
        return userService.findAll();
    }
}