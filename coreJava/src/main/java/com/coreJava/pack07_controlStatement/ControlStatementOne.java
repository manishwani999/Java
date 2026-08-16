package com.coreJava.pack07_controlStatement;

public class ControlStatementOne {

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
    }
}
