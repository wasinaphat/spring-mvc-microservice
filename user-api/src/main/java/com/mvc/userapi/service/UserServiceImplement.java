package com.mvc.userapi.service;

import com.mvc.userapi.model.User;
import com.mvc.userapi.repository.UserRepository;
import com.mvc.userapi.request.UserRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements UserService {
    private UserRepository userRepository;

    public UserServiceImplement(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserRequest user) {
        User data = new User();
        System.out.println(user);
        data.setUsername(user.getUsername()).setPassword(user.getPassword()).setEmail(user.getPassword());

        return userRepository.save(data);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
