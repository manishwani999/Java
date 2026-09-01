package com.coreJava.pack09_Strings;

public class StringBufferMain {
    public static void main(String[] args) {
        /* *
                StringBuffer -
                - mutable
                - Thread safe
        */

        StringBuffer sb = new StringBuffer("Manish");
        System.out.println(sb.capacity()); //! 16 if empty -- 16 + 6 = 22
        System.out.println(sb.length());

        sb = sb.append(" Wani");        // sb - value changed
        String fullName = sb.toString(); // convert to String
        System.out.println(fullName);
    }
}
