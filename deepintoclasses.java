package com.codewithmelvin;

public class deepintoclasses {

    public static void main(String[] args) {
        Stumbo_phone demoPhone = new Stumbo_phone();
        demoPhone.cook();
        demoPhone.move();
        demoPhone.call();
        demoPhone.dance();
    }
}
//You cannot create an object from abstract class directly
abstract class Melvin_phone{

    public void call(){
        System.out.println("Calling.....");
    }
    /*These are the methods i want the phone to have but i don't
    know how to implement them hence i have abstract methods
    which will result the class to be abstract too */

    public abstract void dance();//abstract Methods
    public abstract void move();
    public abstract void cook();
}
//Feziwe Implemented one method after Melvin tried to implement but failed
abstract class Feziwe_phone extends Melvin_phone{

    public void dance(){
        System.out.println("dancing....");
    }
}
//years Later Stumbo came and implemented missing features of the phone


class Stumbo_phone extends  Feziwe_phone{ //concrete class
    public void move(){
        System.out.println("Moving....");
    }
    public void cook(){
        System.out.println("Heat....");
    }
}

/* We can apply this implementation if we were to say given a structure of a software to
program and our duty is to find/ Implement those methods by extending the manager's class
 */
