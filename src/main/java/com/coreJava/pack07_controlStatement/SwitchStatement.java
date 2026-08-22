package com.coreJava.pack07_controlStatement;

public class SwitchStatement {

    public static void day(int day) {
        switch (day) {
            case 1 : {
                System.out.println("Monday");
                break;
            }
            case 2 : {
                System.out.println("Tuesday");
                break;
            }
            case 3 : {
                System.out.println("Wednesday");
                break;
            }
            case 4 : {
                System.out.println("Thursday");
                break;
            }
            case 5 : {
                System.out.println("Friday");
                break;
            }
            case 6 : {
                System.out.println("Saturday");
                break;
            }
            case 7 : {
                System.out.println("Sunday");
                break;
            }
            default:{
                System.out.println("invalid input");
            }
        }
    }


    public static void vowelOrConsonant (char c) {
        switch (c) {
            case 'a' : {
                System.out.println(c + " is an "+"Vowel");
                break;
            }
            case 'e' : {
                System.out.println(c + " is an "+"Vowel");
                break;
            }
            case 'i' : {
                System.out.println(c + " is an "+"Vowel");
                break;
            }
            case 'o' : {
                System.out.println(c + " is an "+"Vowel");
                break;
            }
            case 'u' : {
                System.out.println(c + " is an "+"Vowel");
                break;
            }
            default:
                System.out.println(c + " is a "+"Consonant");
        }
    }


    public static void main(String[] args) {

        day(5);
        vowelOrConsonant('g');

    }
}
