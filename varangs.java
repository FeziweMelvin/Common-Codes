package com.codewithmelvin;

import java.util.Arrays;

public class varangs {

    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.add(4,5,9,3);

    }
}
class Calculator{

    public void add(int ...n ){ //This will take infinitely values and make an array
        /*int summation=0;
        for(int element : n){
            summation = summation + element;
        }
        return  summation;*/
        System.out.println(Arrays.toString(n)) ;
    }

}