package com.coreJava.pack05_Multi_Threading.p03_Thread_Name;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Child Thread Name : " + Thread.currentThread().getName());
    }
}
