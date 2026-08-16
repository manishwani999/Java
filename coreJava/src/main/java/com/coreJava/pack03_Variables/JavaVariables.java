package com.coreJava.pack03_Variables;

/*
    Variable is a named memory location used to store a value.

    int age = 23;
        int - datatype
        age - variable name
        23 - value stored in age.

*/


public class JavaVariables {

//    static variable - automatically initialized to default (0)
    static int age;


//    instance variable - automatically initialized to default (0).
    int instanceCounter;


    public static void main(String[] args) {
        // variable declaration + initialization
        int age = 23;   // Local Variable --> must be initialized at same time of declaration

        // assignment --> change the value of existing variable.
        age = 24;

//        int myAge;  // invalid
//        System.out.println(myAge); // Compile Error: Variable 'myAge' might not have been initialized

        System.out.println(age);

    }
}
