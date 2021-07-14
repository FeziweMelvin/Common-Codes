package com.codewithmelvin;

public class MainClassToRunTheLinklist {
    public static void main(String[] args) {
        Linkedlist myList = new Linkedlist();
        myList.insertElement(3);
        myList.insertElement(5);
        myList.insertElement(7);
        myList.insertElement(9);
        myList.insertElement(2);
        myList.insertAtStart(1);
        myList.show();

    }
}
