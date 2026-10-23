package com.coreJava.pack11_ExceptionHandling;


// Example of throw
public class Voting {

    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible for voting");
        }
        System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {

//        Case 1: without try catch
//        checkAge(17);
        /*
            Exception in thread "main" java.lang.ArithmeticException: Not eligible for voting
	            at com.coreJava.pack11_ExceptionHandling.Voting.checkAge(Voting.java:7)
	            at com.coreJava.pack11_ExceptionHandling.Voting.main(Voting.java:13)
        */

//        Case 2: with try-catch
        try {
            checkAge(17);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /*
            Not eligible for voting
            Program finished

        */

        System.out.println("Program finished");


    }
}
