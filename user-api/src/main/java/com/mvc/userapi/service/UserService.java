package com.mvc.userapi.service;

import com.mvc.userapi.model.DAOUser;
import com.mvc.userapi.request.UserRequest;

import java.util.List;

public interface UserService {

    DAOUser createUser(UserRequest user);
    List<DAOUser> getAllUser();
}
