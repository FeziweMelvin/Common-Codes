package com.codewithmelvin;
//Interface & Implement keyword

/* Interface Doesn't define methods it only Declares like Abstract classes
    Whilst Class can do both Declaring and Defining Methods

    Interface can be extended as multiple (Multiple Inheritance)
 */

public class delegation {
    public static void main(String[] args) {
        //You will note that for obj1 it can access all of the methods
        A_defining obj1 = new A_defining();
        obj1.showing();
        obj1.display();

        //but for obj2 will only access one method which is declared from the interface A_showDeclaring
        A_showDeclaring obj2 = new A_defining();
        obj2.showing();//it only access the method that was declared in the interface

        //obj3 can access all the methods like obj1
        AB_defining obj3 = new AB_defining();
        obj3.showing();
        obj3.showingB();

    }
}
interface A_showDeclaring{

    //we're just declaring hence we use semi colons
    //no need for public
    void showing();
}
//we cannot extend an interface but we implement it
class A_defining implements A_showDeclaring{

    @Override
    public void showing() {
        System.out.println("Showing.... A");
    }
    public void display(){
        System.out.println("Hello world");
    }
}


interface  B_showDeclaring{
    //we're just declaring hence we use semi colons
    //no need for public
    void showingB();
}



//This implements from multiple interfaces
class AB_defining implements  A_showDeclaring , B_showDeclaring{
    @Override
    public void showing() {
        System.out.println("In Show of AB_defining");
    }

    @Override
    public void showingB() {
        System.out.println("In show of AB_defining");
    }
}
