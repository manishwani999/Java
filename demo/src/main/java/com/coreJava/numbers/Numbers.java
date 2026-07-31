package com.coreJava.numbers;

public class Numbers {

    // Reverse a number
    public static void reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev *= 10;
            rev += num % 10;
            num /= 10;
        }
        System.out.println(rev);
    }

    // palindrome number
    public static void palindromeNumber(int num) {
        int temp = num;
        int rev = 0;
        while (num != 0) {
            rev *= 10;
            rev += num % 10;
            num /= 10;
        }
        if (temp == rev) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }

    // Armstrong Number
    public static boolean armstrongNumber(int num) {

        int originalNumber = num;
        int temp = num;
        int sum = 0;

        // find count (Number of digits)
        int count = 0;
        while (num > 0) {
            int last = num % 10;
            count++;
            num /= 10;
        }

        while (temp > 0) {
            int last = temp % 10;
            sum += Math.pow(last, count);
            temp /= 10;
        }

        return sum == originalNumber;
    }

    // Prime number
    public static boolean primeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return isPrime = false;
            }
        }
        return isPrime;
    }

    // print prime numbers in range
    public static void printPrimeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (primeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // find factorial
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // fibonacci series
    public static void fibonacciSeries(int num) {
        int first = 0, second = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    // sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // count digits
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // reverseNumber(1234);
        // palindromeNumber(1212);
        // System.err.println("is Armstrong Number: " + armstrongNumber(153));
        // System.out.println(primeNumber(11));
        // printPrimeInRange(5, 20);
        // System.out.println(factorial(24));
        // fibonacciSeries(8);
        // System.out.println(sumOfDigits(181));
        // System.out.println(countDigits(564));
    }
}
