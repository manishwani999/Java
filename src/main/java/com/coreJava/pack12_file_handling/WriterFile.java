package com.coreJava.pack12_file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("fileHandling.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello World");
            bw.newLine();
            bw.write("Learning file handling in java");
            bw.close();
            System.out.println("Data written to file successfully!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
