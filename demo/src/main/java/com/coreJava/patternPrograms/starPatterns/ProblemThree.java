package com.coreJava.patternPrograms.starPatterns;

public class ProblemThree {

    /*
    =============
        *****
        ****
        ***
        **
        *
     =============
     */

    // using for loop
    public static void solution() {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    using while loop
    public static void solutionTwo() {
        int i = 5;
        while (i >= 1) {
            int j = i;
            while (j >= 1) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        solution();
        solutionTwo();
    }
}
