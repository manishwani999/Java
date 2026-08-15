package com.coreJava.pack05_Multi_Threading.p03_Thread_Name;


public class Main {

    public static void main(String[] args) {
        System.out.println("Main Thread...");
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        t.setName("Madhuri Dixit");
        System.out.println("Main Thread Name by JVM : " +
                Thread.currentThread().getName()); // Main
        Thread.currentThread().setName("Govinda");
        System.out.println("Main Thread Name by Developer: " +
                Thread.currentThread().getName()); // Govinda

    }
}
