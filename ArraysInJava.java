package com.codewithmelvin;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {
        int numbers1[][] ={
                {1,2,3},
                {4,6,9},
                {11,6,3,56}
        };

        //printing the 2D-Array
        for( int rows[] : numbers1){
            for(int element : rows){
                System.out.print(" " +  element);
            }
            System.out.println("");

        }
    }
}



