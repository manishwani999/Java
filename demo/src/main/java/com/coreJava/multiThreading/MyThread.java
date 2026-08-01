package com.coreJava.multiThreading;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {         // Job of the Thread
            System.out.println(Thread.currentThread().getName()); // Executed by child thread
        }
    }
}
