package com.demo.strings;

import java.util.Arrays;

public class StringsSolutions {

    // Reverse String
    public static String reverseString(String str) {

        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }

        return rev.toString();
    }

    // reverse String by words
    public static String reverseByWords(String str) {
        StringBuilder sb = new StringBuilder();
        String[] words = str.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    // check palindrome
    public static boolean isPalindrome(String str) {
        if (str.equalsIgnoreCase(reverseString(str))) {
            return true;
        }
        return false;
    }

    // count words
    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        System.out.println(reverseString("Java"));
        System.out.println(reverseByWords("Java name"));
        System.out.println(isPalindrome("raceCar"));
        System.out.println(countWords("Java   is  awesome"));
    }

}
