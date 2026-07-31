package com.techbulls_Test;

public class ProblemThree {
/*
    Actual Output

    1
    12
    123
    1234

    Expected Output

    987654321
    87654321
    7654321
    654321
    54321
    4321
    321
    21
    1

*/

    public static void solution() {
        for (int i = 9; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
