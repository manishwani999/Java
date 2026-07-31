package com.techbulls_Test;

public class ProblemTwo {

/*
   Actual Output
   1
   12
   123
   1234

   Expected Output
   1
   23
   345
   4567

*/


    public static void solution() {
        for (int i = 1; i <= 4; i++ ) {
            int count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
