package com.codewithmelvin;
import java.lang.*;


public class ExceptionsUnChecked {

    public static void main(String[] args) {
        int i,k,j;
        i=4;
        j=0;
        k=0;
        try{
            k=i/j;
        }
        catch (Exception e){
            System.out.print("Cannot divide by zero hence k is equal to :");
        }
        System.out.println(k);
    }}
