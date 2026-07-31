package com.techbulls_Test;

public class ProblemOne {
/*
        Actual Output
        1
        12
        123

        Expected output
        1
        12
        123
        1234

*/
    public static void solution() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solution();
    }
}
