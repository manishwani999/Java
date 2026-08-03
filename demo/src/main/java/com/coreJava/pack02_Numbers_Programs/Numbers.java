package com.coreJava.pack02_Numbers_Programs;

public class Numbers {

    // find last digit of given number
    public static int lastDigit(int n) {
        return n % 10;
    }

    // find second last digit of given number
    public static int secondLastDigit(int n) {
        return (n /= 10) % 10;
    }

    // find first digit of given number
    public static int firstDigit(int n) {
        while (n > 10) {
            n /= 10;
        }
        return n %= 10;
    }

    // find second digit of given number
    public static int secondDigit(int n) {
        while (n >= 99) {
            n /= 10;
        }
        return n % 10;
    }

    // find sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    //    find average of digits of given number
    public static double averageOfDigits(int n) {
        int sum = 0;
        int count = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
            count++;
        }
        return sum / count;
    }

    // append sum of digit at the end of number
    public static int appendSumAtEnd(int n) {
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (sum >= 10) {
            n *= 100;
        } else {
            n *= 10;
        }
        return n += sum;
    }

    // append sum at first
    public static int appendSumAtFirst(int n) {
        int sum = 0;
        int count = 1;
        int temp = n;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
            count *= 10;
        }
        sum *= count;
        return sum += n;
    }

    // append two numbers
    public static int appendTwoNumbers(int a, int b) {
        int temp = b;
        int count = 1;
        while (temp != 0) {
            temp /= 10;
            count *= 10;
        }
        a *= count;
        return a += b;
    }

    // shift first digit to last    1234 - 2341
    public static int shiftFirstToLast(int n) {
        int temp = n;
        int count = 1;
        while (temp > 10) {
            temp /= 10;
            count *= 10;
        }
        int first = n / count;
        int remainingDigits = n % count;
        return remainingDigits * 10 + first;
    }

    // shift last digit to first    -- 1236 -> 6123
    public static int shiftLastToFirst(int n) {
        int temp = n;
        int count = 1;
        int last = n % 10;

        while (temp > 10) {
            count *= 10;
            temp /= 10;
        }
        int remaining = n / 10;
        return last * count + remaining;
    }

    // Reverse a number
    public static void reverseNumber(int num) {
        String rev = "";        // this approach is useful for 10000 --> 00001
        while (num != 0) {
//            rev *= 10;
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

    // Fibonacci series
    public static void fibonacciSeries(int num) {
        int first = 0, second = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
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

    //

    public static void main(String[] args) {
        System.out.println(shiftLastToFirst(123456));
    }
}
