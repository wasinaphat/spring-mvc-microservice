package com.mvc.userapi.controller;

import com.mvc.userapi.exception.ValidationException;
import com.mvc.userapi.model.User;
import com.mvc.userapi.request.UserRequest;
import com.mvc.userapi.service.UserService;
import com.mvc.userapi.service.UserServiceImplement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

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
    public User createUser(@Valid @RequestBody UserRequest userRequest ){

                return userService.createUser(userRequest);

    }
}
