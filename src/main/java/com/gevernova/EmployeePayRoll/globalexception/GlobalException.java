package com.gevernova.EmployeePayRoll.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(IdNotFound.class)
    public ResponseEntity<String> throwError(IdNotFound idNotFound){
        return new ResponseEntity<>("id not found ",HttpStatus.NOT_FOUND);
    }
}
