package com.coreJava.pack11_ExceptionHandling.customExceptions;

// custom checked exception
public class MinimumBalanceException extends Exception{

    public MinimumBalanceException(String message) {
        super(message);
    }

}
