package com.example;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Mfile1 {
    public static void main(String[] args) throws IOException{
        
        // byte[] data = Files.readAllBytes(Paths.get("D\\fss.txt"));

        String msg = "fss hahaha.";
        Files.writeString(Paths.get("D:\\fss.txt"), msg);
        
        String data = Files.readString(Paths.get("D:\\fss.txt"));
        System.out.print(data);
    }
}
