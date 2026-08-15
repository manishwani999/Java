package com.techbulls_Test;

public class ProblemFour {

/*
    Actual Output

    1
    12
    123
    1234

    Expected Output

    687954321
    87954321
    7954321
    954321
    54321
    4321
    321
    21
    1

*/

    public static void solution() {
        for (int i = 9; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                if (j == 9) {
                    System.out.print(6);
                } else if (j == 6) {
                    System.out.print(9);
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
