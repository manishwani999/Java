package com.coreJava.pack05_Multi_Threading.p04_Thread_Priority;

public class MyThread implements Runnable {
    public void run() {
//        System.out.println("Child Thread .. : " + Thread.currentThread().getName());
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child Thread....");
        }
    }
}
