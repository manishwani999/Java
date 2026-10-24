package com.coreJava.pack11_ExceptionHandling;

public class TrowsKeyword {

    static void divide() throws ArithmeticException {
        int a = 5;
        int b = 0;
        int result = a / b;
        System.out.println(result);
    }

    public static void main(String[] args) {

//        case 1: without try-catch block
//        divide();
        /*
            Exception in thread "main" java.lang.ArithmeticException: / by zero
                at com.coreJava.pack11_ExceptionHandling.TrowsKeyword.divide(TrowsKeyword.java:8)
                at com.coreJava.pack11_ExceptionHandling.TrowsKeyword.main(TrowsKeyword.java:14)

        */

//        case 2: with try-catch block

        try {
            divide();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /*
                / by zero
                Program finished
        */

        System.out.println("Program finished");

    }
}
