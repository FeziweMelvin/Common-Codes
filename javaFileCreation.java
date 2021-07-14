package com.codewithmelvin;

import java.io.File;
//in thid code we will just create a new Empty text file see "JavaFileWriting"&"JavaFileReading"

public class javaFileCreation {
    public static void main(String[] args) {
        try{
            File myFile = new File("mySecondFile.txt");
            if(myFile.createNewFile()){
                System.out.println("The file was created as " + myFile.getName());
            }
            else{
                System.out.println("A file exist with a name of " + myFile.getName());
            }
        }
        catch(Exception e){
            System.out.println("Exception was found :" + e);
        }
        finally {
            System.out.println("the code ends here ..........");
        }
    }

    }

