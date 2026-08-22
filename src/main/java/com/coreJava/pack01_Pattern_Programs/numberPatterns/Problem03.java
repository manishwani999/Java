package com.coreJava.pack01_Pattern_Programs.numberPatterns;

public class Problem03 {
/*
  ============
    11111
    00000
    33333
    00000
    55555
  ============
*/


    public static void solution(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution(5);
    }
}
