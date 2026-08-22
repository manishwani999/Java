package com.coreJava.pack08_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
        int a[] = {10, 20, 30};
        System.out.println(Arrays.toString(a));

//        For each loop

        for (int n : a) {
            System.out.println(n);
        }

    }

}
