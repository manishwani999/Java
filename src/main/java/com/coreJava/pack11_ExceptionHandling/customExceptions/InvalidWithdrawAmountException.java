package com.coreJava.pack11_ExceptionHandling.customExceptions;

// custom unchecked exception
public class InvalidWithdrawAmountException extends RuntimeException{
    public InvalidWithdrawAmountException(String message){
        super(message);
    }
}
