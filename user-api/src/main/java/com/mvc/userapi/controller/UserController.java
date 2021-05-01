package com.mvc.userapi.controller;

import com.mvc.userapi.model.User;
import com.mvc.userapi.request.UserRequest;
import com.mvc.userapi.service.UserService;
import com.mvc.userapi.service.UserServiceImplement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {

        this.userService = userService;
    }

    @GetMapping()
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @PostMapping()
    public User createUser(@RequestBody UserRequest user){
        System.out.println(
                user
        );
        return userService.createUser(user);
    }
}
