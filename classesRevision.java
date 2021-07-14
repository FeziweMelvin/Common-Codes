package com.codewithmelvin;
//In this code i will be coding the implementation of an alien

public class classesRevision {
    public static void main(String[] args) {
        coder3 newObj = new coder3();
        newObj.talk();
    }
}

/*the Director wants to implement an Alien that is able to
talk
walk
interpret statements
be social
be effective
 */

abstract class alien_Implementation{
    //These are the methods the manager wants
    public abstract void talk();
    public abstract void walk();
    public abstract void interpret();

}
abstract class coder1 extends alien_Implementation{
    public void talk() {
        System.out.println("talking");
    }
}
abstract class coder2 extends  coder1{

    public void walk(){
        System.out.println("Walking");
    }
}
class coder3 extends coder2{
    public void interpret(){
        System.out.println("Interpreting");
    }
}


