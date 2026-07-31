package com.coreJava.multiThreading;

public class MultiThreading extends Thread {

    public static void main(String[] args) {
        MultiThreading mt = new MultiThreading();
        mt.start();

    }

    @Override
    public void run() {
        String st = "Java is Awesome Programming Language";
        for (int i = 0; i <= st.length() - 1; i++) {
            System.out.print(st.charAt(i));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
