package com.coreJava.pack11_ExceptionHandling;

public class ExceptionDemo {

    //    without exception handling
    public static void divide() {
        int a = 10;
        int b = 0;
        int result = a / b;
        System.out.println(result);
    }

    //    with exception handling
    public static void division() {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Can not divide by zero");
        } finally {
            System.out.println("Finally block always executed");
        }
    }

    public static void main(String[] args) {
        System.out.println("Program Started");
        division();

        System.out.println("Program Finished");
    }
}
