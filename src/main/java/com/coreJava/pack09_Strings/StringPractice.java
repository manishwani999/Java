package com.coreJava.pack09_Strings;

public class StringPractice {

    //    Reverse a string (Character to Character)
    public static String reverseString(String s) {
        if (s == null || s.isEmpty()) {
            return "String is empty or null";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }


    //    Reverse a String Word to Word
    public static String reverseStringWords(String s) {
        if (s == null || s.isEmpty()) {
            return "String is empty or null";
        }
        String rev = "";
        String[] words = s.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            rev = rev.concat(words[i]);

            if (i > 0) {
                rev = rev.concat(" ");
            }
        }
        return rev;
    }

    //    Check whether a string is a palindrome
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //    Find the length of a string without using length()
    public static int findLengthOfString(String s) {

        int count = 0;
        for (char c : s.toCharArray()) {
            count++;
        }
        return count;
    }

    //    Convert lowercase to uppercase without built-in methods
    public static String toUpperCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        return new String(chars);
    }

    //    Convert uppercase to lowercase without built-in methods
    public static String toLowerCase(String s) {

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }

        return new String(chars);
    }

    //    Compare two strings without equals()
    public static boolean compareStringWithoutEquals(String s1, String s2) {
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    //    Concatenate two strings without using +
    public static String concatenateString(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1);
        sb.append(s2);
        return sb.toString();
    }

    //    Swap two strings without a third variable
    public static void swapTwoStringsWithOutThirdVariable(String s1, String s2) {
        System.out.println("Before Swapping");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        s1 = s1.concat(s2);
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("After Swapping");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
    }

    //    Remove all spaces from a string
    public static String removeAllTheSpacesFromString(String s) {
//        s = s.replaceAll("\\s+", "");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ' && ch != '\t') {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    //    Remove leading and trailing spaces
    public static String removeLeadingAndTrailingSpaces(String s) {
//        s = s.trim();
        int start = 0;
        int end = s.length() - 1;

        while (start <= end && (s.charAt(start) == ' ' || s.charAt(start) == '\t')) {
            start++;
        }

        while(end >= start && (s.charAt(end) == ' ' || s.charAt(end) == '\t')) {
            end--;
        }

        return s.substring(start, end + 1);
    }

    //    Count the number of characters in a string
    public static int countNumberOfCharactersInString(String s) {
        return 0;
    }


    //    return first non-repeating character
    public static char firstNonRepeatingChar(String s) {

        if (s == null || s.isEmpty()) return '$';

        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) return s.charAt(i);
        }

        return '$';
    }

    public static void main(String[] args) {
        System.out.print(removeLeadingAndTrailingSpaces("   M   ani    sh Wa ni   "));
    }
}
