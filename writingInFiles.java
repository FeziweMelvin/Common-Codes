package com.codewithmelvin;
import java.util.*;
import java.io.*;
//in this code we test whether the code did create the file or not
public class writingInFiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File mynewfile = new File("Melvin.txt");
        //This is the file we created in the code saves as FileHandling
        try {
            FileWriter myWriter = new FileWriter("Melvin.txt");
            System.out.println("Does the file exists :" + mynewfile.exists());
            if(mynewfile.canWrite()){
                System.out.println("can we write in the file : " + mynewfile.canWrite());
                myWriter.write("hey melvin im asanda \n");
                myWriter.write("hey asanda im Feziwe \n");
                myWriter.write("hey Feziwe im Biancia \n ");

            }
            else{
                System.out.println("cannot write the in the file");
            }
            System.out.println("Lines written");
            myWriter.close();

        }catch(Exception e){
            System.out.println("Exception found :"+ e);
        }
    }}