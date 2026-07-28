package com.demo.arrays;

public class Arrays {

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

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 40, 5 };
        int[] sort = { 5, 3, 1, 2, 4 };
        int[] arrr = { 4 };

        // findLargest(arr);
        // findSecondLargest(arr);
        // findSmallest(arr);
        // findSecondSmallest(arr);
        // checkSortedArray(arrr);
    }
}
