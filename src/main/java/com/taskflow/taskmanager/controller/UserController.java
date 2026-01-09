package com.taskflow.taskmanager.controller;

import com.taskflow.taskmanager.dto.response.UserResponse;
import com.taskflow.taskmanager.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }


    @GetMapping("/users")
    public List<UserResponse> getUsers() {
        return userService.getAllUsers();
    }
}
