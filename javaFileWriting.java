package com.codewithmelvin;

import java.io.*;
import java.util.Scanner;

public class javaFileWriting {
    public static void main(String[] args) {

        try{
            File myFile = new File("mySecondfile.txt");
            FileWriter myFileWriter = new FileWriter("mySecondfile.txt");
            if(myFile.exists() || myFile.canWrite()){//Test whether the File Exists and can be writable
                System.out.println("this file exists and can be edited");
                myFileWriter.write(" first text will display in the file create \n");
                myFileWriter.write(" Second text will display in the file create \n");
                myFileWriter.write(" Third text will display in the file create \n");
                myFileWriter.close();//Don't forget to object because the words won't appear
            }
            else{
                System.out.println("This file either doesn't exist or cannot be edited");
            }

        }
        catch(Exception e){
            System.out.println("Exception found "+ e);
        }
        finally {
            System.out.println("The code ends here and if the file doesn't have Exceptions then a text was added");
        }
    }


}

