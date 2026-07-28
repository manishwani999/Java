package com.demo.arrays;

import java.util.HashMap;

public class ArraysProblemsIntermediate {

    // find missing numbers
    public static void findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expected = n * (n + 1) / 2;
        int actual = 0;

        for (int num : arr) {
            actual += num;
        }
        System.out.println("Missing Number : " + (expected - actual));
    }

    // count frequency of element
    public static void countFrequencyOfElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6 };
        int[] arr1 = { 1, 2, 3, 4, 2, 3, 5, 2 };
        // findMissingNumber(arr);
        // countFrequencyOfElement(arr1);
    }
}
