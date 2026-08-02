package com.coreJava.patternPrograms.numberPatterns;

public class Problem02 {
/*
  ============
    55555
    44444
    33333
    22222
    11111
  ============
*/

    public static void solution(int n) {
        for (int i = n; i >= 1; i--) {
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
