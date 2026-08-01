package com.coreJava.multiThreading;

public class ThreadDemo {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();    // Thread instantiation
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();                      // starting of thread
        t2.start();
        t3.start();

       /* t1.setName("Ganesh");
        t1.setPriority(10);*/

       /* for (int i = 21; i <= 30; i++) {
            System.out.println("Main Thread............");// Executed by main thread
        }*/
    }

}