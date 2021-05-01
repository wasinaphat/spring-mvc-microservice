package com.mvc.userapi.service;

import com.mvc.userapi.model.User;
import com.mvc.userapi.request.UserRequest;

import java.util.List;

public interface UserService {

    User createUser(UserRequest user);
    List<User> getAllUser();
}
