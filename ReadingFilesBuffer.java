package com.codewithmelvin;
import  java.io.*;
import java.util.*;


public class ReadingFilesBuffer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BufferedWriter bw = null;
        BufferedReader br = null;
        try{

            bw = new BufferedWriter(new FileWriter("Melvin.txt"));


        }
        catch(FileNotFoundException fnfe){
            System.out.println("error file wasn't found");
        }
        catch(IOException ioe){
            System.out.println("error");
        }
        catch (Exception e){
            System.out.println("Unknown Exc");
        }
        finally {
            System.out.println("finished");
        }



    }
}
