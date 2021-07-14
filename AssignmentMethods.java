package com.codewithmelvin;
import java.util.*;
import java.io.*;

public class AssignmentMethods {
    public static void writer(String data) {
        try {
            File myFile = new File("Assignment1.csv");
            Scanner myreader = new Scanner(myFile);
            ArrayList names = new ArrayList();
            if (myFile.exists() && myFile.canWrite() && myFile.canRead()) {
                while(myreader.hasNext())
                    names.add(myreader.nextLine());
                names.add(data);
                System.out.println(names);
            }

            else{
                System.out.println("File either cannot write or exist or read");
            }
        }
        catch (IOException e) {
            System.out.println("Exception :" + e.getMessage());
        }
    }
    public static void reader(){
        try{
            File myFile = new File("Assignment1.csv");
            Scanner myReader = new Scanner(myFile);
            if(myFile.exists() && myFile.canRead()){
                while( myReader.hasNext()) {
                    System.out.println(myReader.nextLine());
                }
            }
            else{
                System.out.println("The file either doesn't exist or cannor read");
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception :"+ e.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception :" + e.getMessage());
        }

    }



    public static void main(String[] args) {
        writer("melvin");
        reader();
    }
}
