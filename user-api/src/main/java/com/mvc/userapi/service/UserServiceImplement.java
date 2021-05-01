package com.mvc.userapi.service;

import com.mvc.userapi.exception.ValidationException;
import com.mvc.userapi.model.DAOUser;
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
    public DAOUser createUser(UserRequest user) {
        DAOUser data = new DAOUser();
        System.out.println(user);
        data.setUsername(user.getUsername()).setPassword(user.getPassword()).setEmail(user.getPassword()).setRole("customer");
        try {
            return userRepository.save(data);
        }catch (Exception ex){

                throw  new ValidationException(ex.getMessage());
        }

    }

    @Override
    public List<DAOUser> getAllUser() {
        return userRepository.findAll();
    }
}
