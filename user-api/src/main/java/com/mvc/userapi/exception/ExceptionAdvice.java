package com.mvc.userapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String handleUserNotFound(UserNotFoundException ex){
        return  ex.getMessage();
    }
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String handlerValidation(ValidationException ex) {
        return ex.getMessage();
    }

}
