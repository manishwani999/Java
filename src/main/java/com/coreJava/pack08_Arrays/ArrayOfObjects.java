package com.coreJava.pack08_Arrays;

import java.util.Arrays;

class Student {
    int id;
    String name;
    double marks;


    Student() {}

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
public class ArrayOfObjects {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Manish";
        s1.marks = 80.00;

        Student s2 = new Student(2, "Rahul", 91.00);
        Student s3 = new Student(3, "Anurag", 69.00);

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student s : students) {
            System.out.println(s.id + "] " +s.name + " " + s.marks + "%");
        }


    }
}
