package com.paypal.bfs.test.employeeserv.exceptions;

public class ArgumentNotValidException extends Exception {
    public ArgumentNotValidException(String errMessage){
        super(errMessage);
    }
}
