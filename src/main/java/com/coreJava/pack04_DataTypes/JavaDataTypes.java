package com.coreJava.pack04_DataTypes;

/*
    Datatype: datatype defines which type of data variable can hold and also defines
    how much memory is allocated and what kind of operation can be performed on that
    data.



*/

public class JavaDataTypes {

    public static void main(String[] args) {

//        Primitive Datatype
        byte b = 127;
        short s = 655;
        int age = 18;
        long large = 654783l;
        float average = 17.5f;
        double avg = 857.2256;
        char c = 'A';
        boolean status = false;

//        No automatic Downcasting
        int x = 100;
//        byte bx = x; // incompatible types: possible lossy conversion from int to byte
        byte bc = (byte) x;
        System.out.println(bc);

    }
}
