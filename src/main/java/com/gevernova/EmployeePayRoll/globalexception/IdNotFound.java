package com.gevernova.EmployeePayRoll.globalexception;

public class IdNotFound extends RuntimeException{
    public IdNotFound(String message){
        super(message);
    }
}
