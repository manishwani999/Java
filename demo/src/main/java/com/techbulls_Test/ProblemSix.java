package com.techbulls_Test;

public class ProblemSix {

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
        for (int i = 1; i <= rows; i++) {
//            print spaces
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(" ");
            }

//            print increment
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

//            print decrement
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        int shift = rows + 3;
        for (int i = rows; i >= 1; i--) {
//            print spaces
            for (int j = 1; j <= shift + rows - i; j++) {
                System.out.print(" ");
            }
//            print increment
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
//            print decrement
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        solution();
    }
}
