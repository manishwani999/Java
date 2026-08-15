package com.coreJava.pack01_Pattern_Programs.starPatterns;

public class Problem04 {

    /*
     =============
             *
            **
           ***
          ****
         *****
     =============
     */

    // using for loop
    public static void solution() {
        for (int i = 1; i <= 5; i++) {
            // print spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // print stars
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //using while loop
    public static void solutionTwo() {
        int i = 1;
        while (i <= 5) {
            int j = 5;
            while (j > i) {
                System.out.print(" ");
                j--;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        solution();
        solutionTwo();
    }
}
