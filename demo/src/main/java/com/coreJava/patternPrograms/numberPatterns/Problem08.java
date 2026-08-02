package com.coreJava.patternPrograms.numberPatterns;

// These problems are with space
public class Problem08 {

    /*
    Pattern - 1
      ============
        55555
         4444
          333
           22
            1
      ============
    */

    public static void solution01() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            // print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // print numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

        /*
    Pattern - 2
      ============
        12345
         1234
          123
           12
            1
      ============
    */

    public static void solution02() {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

        /*
    Pattern - 3
      ============
            1
           22
          333
         4444
        55555
      ============
    */

    public static void solution03() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

        /*
    Pattern - 4
      ============
            5
           44
          333
         2222
        11111
      ============
    */

    public static void solution04() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

        /*
    Pattern - 5
      ============
        12345
         2345
          345
           45
            5
      ============
    */

    public static void solution05() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

        /*
    Pattern - 6
      ============
            1
           12
          123
         1234
        12345
      ============
    */

    public static void solution06() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

        /*
    Pattern - 7
      ============
            1
           21
          321
         4321
        54321
      ============
    */

    public static void solution07() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

        /*
    Pattern - 8
      ============
            5
           54
          543
         5432
        54321
      ============
    */

    public static void solution08() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

        /*
    Pattern - 9
      ============
            5
           45
          345
         2345
        12345
      ============
    */

    public static void solution09() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    Pattern - 10
      ============
        54321
         4321
          321
           21
            1
      ============
    */

    public static void solution10() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution01();
        solution02();
        solution03();
        solution04();
        solution05();
        solution06();
        solution07();
        solution08();
        solution09();
        solution10();
    }

}
