package com.coreJava.pack05_Multi_Threading.p01_Thread_Define;

public class ThreadDemo {

    public static void main(String[] args) {

        /*
//        Defining Thread by extending Thread class
        MyThread t1 = new MyThread();    // Thread instantiation
        t1.start();                      // starting of thread

//        Defining Thread by implementing Runnable interface
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
*/
/*
//  Third approach to start thread (not recommended)
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();

        */

        for (int i = 0; i <= 10; i++) {
            System.out.println("Main Thread............");// Executed by main thread
        }
    }

}