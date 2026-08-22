package com.coreJava.pack07_controlStatement;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Before while loop");
        while (i < 5) {
            System.out.println("Inside while Loop " + i);
            i++;
        }
        System.out.println("After while loop");
    }
}
