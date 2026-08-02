package com.coreJava.patternPrograms.starPatterns;

public class Problem05 {


    /*
    ============
        *****
         ****
          ***
           **
            *
    ============
     */

    public static void solution() {
        // rows
        for (int i = 5; i >= 1; i--) {
            // print spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        solution();
    }
}
