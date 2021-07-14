package com.codewithmelvin;
import java.io.*;
import java.util.*;

//In this code we create our own Exception
public class CreatingException {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try{
        System.out.print("Enter the value of n :");
        int number =input.nextInt();
        if( number>5){
            System.out.println("great ");
        }
        else{
            throw new myException1("The number is less than 5 ");
        }
    }
    catch(myException1 me){
        System.out.println("Run it again"+ me );
        }
    catch(Exception e){
        System.out.println("unknown Exception but remember to enter a value >5 and an integer....");
    }
    }
}
class myException1 extends Exception{
    public myException1(String message) {
        super(message);
    }
}