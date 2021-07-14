package com.codewithmelvin;

import java.io.*;

public class ReadingFileBuffer {
    public static void main(String[] args) {
        try{
            BufferedReader buffer =new BufferedReader(new FileReader("Melvin.txt"));

            while((buffer.readLine())!=null){
                System.out.println();

            }
        }
        catch(FileNotFoundException a){
            System.out.println("Exception : "+ a.getMessage());
        }
        catch(IOException b){
            System.out.println("Exception :" + b.getMessage());
        }

    }
}
