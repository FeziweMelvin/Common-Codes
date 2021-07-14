package com.codewithmelvin;
import java.util.*;

public class Factorial {
    public static int factorial(int number){
        if (number == 1){
            return number;
        }
        else
            return number *factorial(number-1) ;

    }
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Please enter the number you want the factorial of :");
        int factorialNumber= keyboard.nextInt();
        System.out.println(factorial(factorialNumber));


    }
}
