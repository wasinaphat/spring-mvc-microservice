package com.mvc.userapi.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String username){
        super("Could not found users" + username);
    }
}
