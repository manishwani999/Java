package com.demo.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ArraysProblems {

    // find largest elements
    public static void findLargest(int arr[]) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }

    // find second largest element
    public static void findSecondLargest(int[] arr) {
        int max = arr[0];
        int smax = max;
        for (int num : arr) {
            if (num > max) {
                smax = max;
                max = num;
            } else if (num > smax && num != max) {
                smax = num;
            }
        }
        System.out.println("Largest Element : " + max);
        System.out.println("Second Large Element : " + smax);
    }

    // find smallest element
    public static void findSmallest(int[] arr) {
        int small = arr[0];
        for (int num : arr) {
            if (num < small) {
                small = num;
            }
        }
        System.out.println("Smallest element : " + small);
    }

    // find second smallest element
    public static void findSecondSmallest(int[] arr) {
        int small = Integer.MAX_VALUE;
        int sSmall = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < small) {
                sSmall = small;
                small = num;
            } else if (num < sSmall && num != small) {
                sSmall = num;
            }
        }
        System.out.println("Small Element : " + small);
        System.out.println("Second Small Element : " + sSmall);
    }

    // Reverse an Array
    public static void reverseArray(int[] arr) {
        System.out.println("Array Before Reverse : " + Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Array After Reverse :  " + Arrays.toString(arr));
    }

    // check array is sorted or not
    public static void checkSortedArray(int[] arr) {

        if (arr == null) {
            System.out.println("Array is null");
            return;
        }

        if (arr.length <= 0) {
            System.out.println("array is empty");
            return;
        }

        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    // Remove Duplicates - sorted array
    public static int removeDuplicatesSorted(int arr[]) {

        if (arr.length == 0) {
            return 0;
        }

        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            }
        }

        return index + 1;
    }

    // remove duplicates - unsorted array
    public static void removeDuplicatesUnsorted(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }

    // Move all zeros to end
    public static void moveAllZerosToEnd(int[] arr) {
        int index = 0; // { 4, 0, 5, 2, 0, 1, 0, 0, 2 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // left rotate array by one
    public static void leftRotateArrayByOne(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        System.out.println(Arrays.toString(arr));
    }

    // right rotate array by one
    public static void rightRotateArrayByOne(int arr[]) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));
    }

    // right rotate by k
    public static void rightRotateByK(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter K : ");
        int k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = last;
        }

        System.out.println(Arrays.toString(arr));
    }

    // rotate array left by k
    public static void leftRotateByK(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter K : ");
        int k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            int first = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }
            arr[arr.length - 1] = first;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] sort = { 5, 3, 1, 2, 4 };
        int[] arrr = { 4, 0, 5, 2, 0, 1, 0, 0, 2 };
        int[] dup = { 1, 2, 2, 3, 4, 5, 5 };

        // findLargest(arr);
        // findSecondLargest(arr);
        // findSmallest(arr);
        // findSecondSmallest(arr);
        // checkSortedArray(arrr);
        /*
         * int length = removeDuplicatesSorted(dup);
         * for (int i = 0; i < length; i++) {
         * System.out.print(dup[i] + " ");
         * }
         */

        // System.out.println();
        // removeDuplicatesUnsorted(dup);

        // reverseArray(arr);
        // moveAllZerosToEnd(arrr);
        // leftRotateArrayByOne(arr);
        // rightRotateArrayByOne(arr);
        // rightRotateByK(arr);
        // leftRotateByK(arr);

    }
}
