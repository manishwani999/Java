package com.demo.arrays;

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

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6};
        findMissingNumber(arr);
    }
}
