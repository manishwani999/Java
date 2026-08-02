package com.coreJava.pack05_Multi_Threading.p04_Thread_Priority;

public class Main {
    public static void main(String[] args) {

        Thread.currentThread().setPriority(1);

        MyThread mt = new MyThread();
        Thread t = new Thread(mt);

        t.setPriority(10);

        t.start();


        for (int i = 0; i <= 10; i++) {
            System.out.println("Main thread....");
        }
        

        System.out.println("Min Priority : " + Thread.MIN_PRIORITY);
        System.out.println("Norm Priority : " + Thread.NORM_PRIORITY);
        System.out.println("Max Priority : " + Thread.MAX_PRIORITY);

        System.out.println("child thread prio : " + t.getPriority());
        System.out.println("main thread prio : " + Thread.currentThread().getPriority());


    }
}
