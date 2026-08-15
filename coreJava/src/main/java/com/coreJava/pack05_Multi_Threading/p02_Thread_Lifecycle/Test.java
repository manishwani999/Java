package com.coreJava.pack05_Multi_Threading.p02_Thread_Lifecycle;

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


public class Test {
    public static void main(String[] args) {
        MyThread t = new MyThread();    // New state or Born State
        t.start();                      // Ready state or Runnable state
        System.out.println(Thread.currentThread().getName());
//        t.start();
    }
}
