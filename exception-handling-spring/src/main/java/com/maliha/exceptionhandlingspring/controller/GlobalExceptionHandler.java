package com.maliha.exceptionhandlingspring.controller;

import com.maliha.exceptionhandlingspring.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.InputMismatchException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({Exception.class})
    public String handleException(){
        return "Exception";
    }

    @ExceptionHandler({ArrayIndexOutOfBoundsException.class})
    public ResponseEntity<?> handleArrayIndexOutofBoundException(){
        return new ResponseEntity<>(new CustomException().getMessage(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler({NullPointerException.class})
    public ResponseEntity<?> handleNullPointerException(){
        return new ResponseEntity<>(new CustomException("Null will not work. Give something to get the String").getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({InputMismatchException.class})
    public ResponseEntity<?> handleInputMismatchException(){
        return new ResponseEntity<>(new CustomException("Input doesn't have any Animal.Try another alphabet").getMessage(), HttpStatus.BAD_REQUEST);
    }
}
