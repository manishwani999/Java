package com.techbulls_Test.test;

public class Solutions {

    /*
        1
        12
        123
        1234
    */

    public static void solutionOne() {
        int row = 4;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
       1
       23
       345
       4567
    */

    public static void solutionTwo() {
        int row = 4;
        for (int i = 1; i <= row; i++) {
            int count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    /*
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

    public static void solutionThree() {
        int row = 9;
        for (int i = row; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


    /*
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

    public static void solutionFour() {
        int row = 9;
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

    /*
        1
       121
      12321
     1234321
     1234321
      12321
       121
        1
    */

    public static void solutionFive() {
        int row = 4;
        for (int i = 1; i <= row * 2; i++) {
            int currentRow;
            if (i <= row) {
                currentRow = i;
            } else {
                currentRow = 2 * row - i + 1;
            }

//            spaces
            for (int j = 1; j <= row - currentRow; j++) {
                System.out.print(" ");
            }

//            increment
            for (int j = 1; j <= currentRow; j++) {
                System.out.print(j);
            }

//            decrement
            for (int j = currentRow - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();

        }
    }


    /*
       1
      121
     12321
    1234321
           1234321
            12321
             121
              1
    */

    public static void solutionSix() {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        int shift = rows + 3;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= shift + rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void solutionPractice() {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j-- ) {
                System.out.print(j);
            }
            System.out.println();
        }
        int shift = rows + 3;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= shift + rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

//        solutionOne();
//        solutionTwo();
//        solutionThree();
//        solutionFour();
//        solutionFive();
//        solutionSix();

//        solutionPractice();

    }

}
