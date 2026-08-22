package com.coreJava.pack10_Oops;


/* *
    Class and Object
*/

class Calculator {
    public int calciAdd (int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

//        ! To use the method of class Calculator create object.
        Calculator calci = new Calculator();
        int result = calci.calciAdd(10, 20);
        System.out.println(result);

    }
}
