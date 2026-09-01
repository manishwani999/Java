package com.coreJava.pack09_Strings;

public class StringMain {
    public static void main(String[] args) {
//        String creation
        String name = new String("Manish");
        String address = "Chalisgaon";
        System.out.println("hello " + name);    // concatenation using + operator


//        ! String Memory Management
        String s1 = "Manish";
        String s2 = "Manish";
        String s3 = s1;
        String s4 = name;

        System.out.println(s1 == s2);   // ? true   - checks memory address
        System.out.println(s2 == s3);   // ? true
        System.out.println(name == s3); // ! false
        System.out.println(name.equals(s3)); // ? true - checks content
        System.out.println(name == s4); // ? true



//        ! String Methods

        System.out.println("charAt : " + name.charAt(5));
        System.out.println("length : " + name.length());
        name.chars()
                .forEach(ch -> System.out.print((char) ch + " "));


    }
}
