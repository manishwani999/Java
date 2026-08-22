package com.coreJava.pack01_Pattern_Programs.numberPatterns;

public class Problem06 {

    /*
  ============
    12345
    12345
    12345
    12345
    12345
  ============

  ============
    54321
    54321
    54321
    54321
    54321
  ============
*/

    public static void solution1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void solution2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution1();
        solution2();
    }
}
