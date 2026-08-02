package com.coreJava.patternPrograms.numberPatterns;

public class Problem01 {

/*
  ============
    11111
    22222
    33333
    44444
    55555
  ============
*/


    public static void solution(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution(5);
    }
}
