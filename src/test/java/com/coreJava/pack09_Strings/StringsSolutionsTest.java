package com.coreJava.pack09_Strings;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsSolutionsTest {
    @Test
    void reverseString() {
        String actual = StringsSolutions.reverseString("Java");
        String expected = "avaJ";
        assertEquals(actual, expected);

    }

    @Test
    void reverseByWords() {
        String actual = StringsSolutions.reverseByWords("Java is awesome");
        String expected = "awesome is Java";
        assertEquals(actual, expected);
    }

    @Test
    void isPalindrome() {
        boolean actual = StringsSolutions.isPalindrome("nitin");
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    void countWords() {
        int actual = StringsSolutions.countWords("Manish Wani");
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    void shiftFirstToLast() {
        String actual = StringsSolutions.shiftFirstCharToLast("Manish");
        String expected = "anishM";
        assertEquals(actual, expected);
    }
}
