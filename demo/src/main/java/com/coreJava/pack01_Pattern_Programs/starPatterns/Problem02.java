package com.coreJava.pack01_Pattern_Programs.starPatterns;

public class Problem02 {

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
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // using while loop
    public static void solutionTwo() {
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
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
