package com.coreJava.pack07_controlStatement;

public class ControlStatementOne {

//    find greater number
    public static void findLarge () {
        int a = 10, b = 15, c = 7;

        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }



    public static void main(String[] args) {
        int a = 0;
        boolean condition = a >= 10;
        if (condition) {
            System.out.println(a);
        } else {
            System.out.println("condition not satisfied");
        }

        if (a <= 0) {
            System.out.println(a);
        } else {
            System.out.println("condition not satisfied");
        }

        findLarge();
    }
}
