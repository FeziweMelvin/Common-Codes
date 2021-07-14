package com.codewithmelvin;

import java.io.*;
import java.util.*;

//This code we'll use the same file that weve been using to read data from it
public class prac {
    public static void main(String[] args) {
        try{

            File myFile = new File("Assignment1.csv");
            Scanner myreader = new Scanner(myFile);
            String[] s = new String[4];
            int i =0;
            if(myFile.exists() && myFile.canRead()){
                System.out.println("The file exists and it's readable....");
                ArrayList newList = new ArrayList();
                while(myreader.hasNext()){
                    newList.add(myreader.next());
                }

                System.out.println(newList);
                System.out.println(newList.size());

            }else{
                System.out.println("Your file is unreadable");
            }
            myreader.close();
        }
        catch(FileNotFoundException ae){
            System.out.println("The file wasn't found");
        }
        catch(Exception e){
            System.out.println("Uknown Exception");
        }
        finally{
            System.out.println("The code ends here............");
        }
    }
}