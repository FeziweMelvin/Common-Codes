package com.codewithmelvin;
/*
public  class doubleLinked{
    public static void main(String[] args) {
        dll newDouble = new dll();
        newDouble.addLast(4);
        newDouble.addFront(1);
        newDouble.addLast(9);
        newDouble.addLast(4);
        newDouble.addFront(19);

        newDouble.printlIst();
    }

}

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
    }
}
class dll{
    Node head;

    public void addFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head!= null){
            head.prev=newNode;
        }
        head=newNode;


    }
    public void addLast(int data){
        Node newNode = new Node(data);
        newNode.next = null;
        newNode.prev = null;

        if(head==null){
            //meaning the list was empty
            head=newNode;
        }
        else{
            Node currentNode=head;
            while(currentNode.next != null){
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
            newNode.prev=currentNode;
        }

    }
    public void printlIst(){
        Node currentNode=head;
        while(currentNode.next != null){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
        System.out.println(currentNode.data);
    }
}

*/
