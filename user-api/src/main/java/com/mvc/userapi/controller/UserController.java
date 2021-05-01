package com.mvc.userapi.controller;

import com.mvc.userapi.model.DAOUser;
import com.mvc.userapi.request.UserRequest;
import com.mvc.userapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {

        this.userService = userService;
    }

    @GetMapping()
    public List<DAOUser> getAllUser(){
        return userService.getAllUser();
    }
    @PostMapping()
    public DAOUser createUser(@Valid @RequestBody UserRequest userRequest ){

                return userService.createUser(userRequest);

    }
}
