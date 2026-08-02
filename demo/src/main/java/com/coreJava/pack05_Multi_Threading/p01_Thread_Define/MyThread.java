package com.coreJava.pack05_Multi_Threading.p01_Thread_Define;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {         // Job of the Thread
            System.out.println("Child Thread"); // Executed by child thread
        }
    }

    public void start() {
        super.start();
        System.out.println("start method");
    }
}
