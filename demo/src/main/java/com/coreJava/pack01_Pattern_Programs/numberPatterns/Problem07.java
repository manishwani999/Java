package com.coreJava.pack01_Pattern_Programs.numberPatterns;

// These problems are without space
public class Problem07 {
    /*
    Pattern - 1
      ============
        5
        44
        333
        2222
        11111
      ============
    */

    public static void solution01() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /*
    Pattern - 2
      ============
        5
        54
        543
        5432
        54321
      ============
    */

    public static void solution02() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    Pattern - 3
      ============
        1
        12
        123
        1234
        12345
      ============
    */

    public static void solution03() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    Pattern - 4
      ============
        1
        21
        321
        4321
        54321
      ============
    */

    public static void solution04() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    Pattern - 5
      ============
        5
        45
        345
        2345
        12345
      ============
    */

    public static void solution05() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    Pattern - 6
      ============
        11111
        2222
        333
        44
        5
      ============
    */

    public static void solution06() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /*
    Pattern - 7
      ============
        12345
        1234
        123
        12
        1
      ============
    */

    public static void solution07() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


    /*
    Pattern - 8
      ============
        12345
        2345
        345
        45
        5
      ============
    */

    public static void solution08() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    Pattern - 9
      ============
        54321
        4321
        321
        21
        1
      ============
    */

    public static void solution09() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    Pattern - 10
      ============
        54321
        5432
        543
        54
        5
      ============
    */

    public static void solution10() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    Pattern - 11
      ============
        55555
        4444
        333
        22
        1
      ============
    */

    public static void solution11() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        solution11();
    }
}
