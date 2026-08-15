package com.coreJava.pack01_Pattern_Programs.numberPatterns;

public class Problem05 {
/*
  ============
        1
       22
      333
     4444
    55555
  ============
*/

    public static void solution(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution(5);
    }
}
