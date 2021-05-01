package com.mvc.userapi.exception;

public class ValidationException extends RuntimeException{
    public ValidationException(String message) {
        super( message);
    }
}
