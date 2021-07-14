package com.codewithmelvin;
//polymorphism
public class overloading_ride {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.show_overload();
        obj.show_overload(2);

        Overriding obj2 = new Overriding();
        obj2.show_overload();

    }
}

class Overloading{
    //These two methods will work differently depending to the user if he/she passes in a parameter or not
    public void show_overload(){
        System.out.println("You in Show ");
        }
    public void show_overload(int i){
        System.out.println("You in show " + i);
    }
}
class Overriding extends Overloading{ //Inheritance

    public void show_overload(){ //This Overwrites the Prev Method of Show Hence it is called Overriding
        System.out.println("You in show but Riding");
    }
}