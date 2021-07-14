package com.codewithmelvin;

class A {
    static int i=0;
    public A(){
        i++;
    }
    public int counter(){
        return i;
    }
}
public class counterClass {
    public static void main(String[] args) {
        A new1 = new A();
        A new2 = new A();
        
        System.out.println(new2.counter());
    }
}
