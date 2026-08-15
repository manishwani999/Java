package com.coreJava.pack04_Strings;

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

    // shift first character to last from string
    public static String shiftFirstCharToLast(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str.charAt(0));
        sb.deleteCharAt(0);
        return sb.toString();
    }

    // shift last character to first from string
    public static String shiftLastCharToFirst(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(0, sb.charAt(sb.length() - 1));
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    // swap first and last character from string
    public static String swapFirstAndLastChar(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(0, str.charAt(str.length() - 1));
        sb.append(str.charAt(0));
        sb.deleteCharAt(1);
        sb.deleteCharAt(sb.length() - 2);
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(reverseString("Java"));
        System.out.println(reverseByWords("Java name"));
        System.out.println(isPalindrome("raceCar"));
        System.out.println("Number of words : " + countWords("Java   is  awesome"));
        System.out.println(shiftFirstCharToLast("Manish"));
        System.out.println(shiftLastCharToFirst("anishM"));
        System.out.println(swapFirstAndLastChar("Ganesh"));
    }

}
