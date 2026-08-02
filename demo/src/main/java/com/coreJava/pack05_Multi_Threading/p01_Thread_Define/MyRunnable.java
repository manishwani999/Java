package com.coreJava.pack05_Multi_Threading.p01_Thread_Define;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Runnable Thread..");
        }
    }
}
