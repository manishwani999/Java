package com.coreJava.pack10_Oops.encapsulation;

public class Main extends PrivateData {
    public static void main(String[] args) {
        PrivateData pd = new PrivateData();

//        without encapsulation

        pd.name = "Manish";
        pd.age = 25;
// !       pd.email;    // restricted
// !       pd.mobile;   // restricted

        System.out.println(pd.name + " : " + pd.age);

//        with encapsulation

        pd.setEmail("manish@gmail.com");
        pd.setMobile("9529421452", pd);

        System.out.println(pd.getEmail());
        System.out.println(pd.getMobile());

    }
}
