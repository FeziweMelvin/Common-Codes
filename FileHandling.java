package com.codewithmelvin;
import java.util.*;
import java.io.*;
//in this code we just create a new empty file

public class FileHandling {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        File names =new File("Melvin.txt");//"C:\\Users\\Feziwe Melvin\\IdeaProjects\\Feziwe Melvin\\src\Melvin.txt.txt"
        try{
            if(names.createNewFile()){
                System.out.println("File created " + names.getName());
            }
            else{
                System.out.println("File exists" + " saved as " + names.getName());
            }
        }
        catch(Exception e){
            System.out.println("error Exceptions : " + e);
        }

    }
}
