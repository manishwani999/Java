package com.techbulls_Test;

public class ProblemFive {

/*
    Actual Output

        1
       121
      12321
     1234321

    Expected Output

        1
       121
      12321
     1234321
     1234321
      12321
       121
        1

*/

    public static void solution() {
        int rows = 4;
        for (int i = 1; i <= rows * 2 ; i++) {
            int currentRow;
            if (i <= rows) {
                currentRow = i;
            } else {
                currentRow = 2 * rows - i + 1;
            }

//            Print spaces
            for (int j = 1; j <= rows - currentRow; j++) {
                System.out.print(" ");
            }

//            print increment
            for (int j = 1; j <= currentRow; j++) {
                System.out.print(j);
            }

//            print decrement
            for (int j = currentRow-1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solution();
    }
}
