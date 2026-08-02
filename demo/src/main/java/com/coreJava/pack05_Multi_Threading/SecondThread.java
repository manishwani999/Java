package com.coreJava.pack05_Multi_Threading;

public class SecondThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Runnable Thread..");
        }
    }
}
