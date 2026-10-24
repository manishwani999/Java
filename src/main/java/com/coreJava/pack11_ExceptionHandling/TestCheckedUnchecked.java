package com.coreJava.pack11_ExceptionHandling;

import java.io.IOException;

public class TestCheckedUnchecked {

    //    Unchecked exception -> we can only throw an exception with throw, no need of declare
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero0");
        }
        System.out.println(a / b);
    }

    /*    Checked exception -> we have to declare exception, as well as throw inside method,
                               and handle with try-catch or method declaration.
    */
    public static void readFile() throws IOException {
        throw new IOException("File not found");
    }


    public static void main(String[] args) {
//        divide(10, 0);

        try {
            readFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
