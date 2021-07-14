package com.codewithmelvin;

public class Recursion {
    public static int fibonacci(int number){
        if (number <= 1){
            return 1;}
        else
            return fibonacci(number -1) + fibonacci(number -2);

    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}

