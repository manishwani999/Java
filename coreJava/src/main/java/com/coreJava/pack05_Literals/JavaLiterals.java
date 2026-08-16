package com.coreJava.pack05_Literals;

public class JavaLiterals {

    public static void main(String[] args) {

/*      Any integer literal without a suffix is treated as an int.
        Assigning an out-of-range value without an L suffix causes a
        compilation error.

        Any decimal literal without a suffix is treated as a double.
        Assigning it to a float without an f or F suffix causes a compilation error.
*/
        int a = 077;    // octal number to decimal
        System.out.println(a);

        int b = 0xAF;
        System.out.println(b);

        int c = 0b1011;
        System.out.println(c);

/*      Underscore Rules (_ in numeric literals):
        Introduced to improve readability (e.g., 1_000_000).
        Cannot be placed at the beginning or end of a literal
            (e.g., _100 or 100_ are invalid).
        Cannot be placed adjacent to a decimal point (e.g., 3._14 is invalid).
        Cannot be placed prior to an L or F suffix (e.g., 100_L is invalid).
*/
        long population = 1_000_000_000_000_000l;
        System.out.println(population);

/*
        Number bases and formats

        Binary: Prefixed with 0b or 0B (e.g., 0b1101).
        Octal: Prefixed with 0 (e.g., 077 equals 63 in decimal).
        Hexadecimal: Prefixed with 0x or 0X (e.g., 0xFF equals 255 in decimal).
*/

        int bin = 0B1101;
        int bin1 = 0b1101;

        int oct = 077;

        int hexb = 0xFF; // 255
        int hexa = 0XFF; // 255


        // Integer Literals across bases
        int decimal = 100;
        int octal = 0144;         // 100 in decimal
        int hex = 0x64;           // 100 in decimal
        int binary = 0b1100100;   // 100 in decimal

        // Underscores for readability
        long creditCard = 1234_5678_9012_3456L; // Valid
        double pi = 3.141_592;                   // Valid

        // Character & Escape Sequences
        char singleQuote = '\'';
        char unicodeDigit = '\u0035'; // Character '5'

        // Text Block String Literal (Java 15+)
        String jsonBlock = """
                {
                    "language": "Java",
                    "status": "Active"
                }
                """;

        System.out.println("Base comparisons (all equal 100): " + (decimal == octal && octal == hex && hex == binary));
        System.out.println("Formatted Credit Card: " + creditCard);
        System.out.println("Unicode Char: " + unicodeDigit);
        System.out.println("JSON Block:\n" + jsonBlock);


    }
}
