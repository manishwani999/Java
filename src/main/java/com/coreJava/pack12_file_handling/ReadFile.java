package com.coreJava.pack12_file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
    public static void main(String[] args) {

        /*
            Try with Resources is used in this program
        */
        try (BufferedReader br = new BufferedReader
                (new FileReader("fileHandling.txt"))) {

//            FileReader fr = new FileReader("fileHandling.txt");
//            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
//            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
