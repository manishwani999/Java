package com.coreJava.pack11_ExceptionHandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
//            Arithmetic Exception
            int a = 10/0;

//            Array Index out of bounds exception
            int[] arr = new int[3];
            System.out.println(arr[5]);

//            NullPointerException
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }  catch (NullPointerException e) {
            System.out.println("NullPointer Exception");
        }  catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally executed");
        }
        System.out.println("Program Ended");
    }
}
