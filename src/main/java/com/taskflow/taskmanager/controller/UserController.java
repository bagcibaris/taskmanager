package com.taskflow.taskmanager.controller;

import com.taskflow.taskmanager.domain.User;
import com.taskflow.taskmanager.dto.request.UserCreateRequest;
import com.taskflow.taskmanager.dto.response.UserResponse;
import com.taskflow.taskmanager.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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


    @PostMapping("/users")
    public UserResponse createUser(@Valid @RequestBody UserCreateRequest request) {
        User user = userService.createUser(
                request.getName(),
                request.getEmail(),
                request.getPassword()
        );

        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getCreatedAt()
        );
    }

}
