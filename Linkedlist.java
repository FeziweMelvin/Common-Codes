package com.codewithmelvin;

public class Linkedlist {

    //Head node of the linkedList and by default head is null;
    Node head;

    public void insertElement(int data){
        //Creating a new Node with a Data field and the address/Pointer field
        Node node = new Node(data);
        node.next=null;

        //linking the node in the linked list
        if(head==null){
            //meaning the linkedlist was Empty
            head=node;
        }
        else{
            Node currentNode=head;
            while(currentNode.next!=null) {//The loop will stop when we get a null value
                currentNode = currentNode.next;
            }
            currentNode.next=node;
        }
    }
    public void insertAtStart(int data){
        Node node = new Node(data);
        node.next=null; //by default
        node.next=head;//Storing the address of the current head node into the new node's head

        head = node;// We set the node to the head


    }
    public void listSize(){
        int count =1;
        Node current=head;
        while(current.next != null){
            count++;
            current=current.next;
        }
        System.out.println("Size :" + count);
    }
    public void show(){
        //method to print the linkedlist
        Node currentNode=head;
        while(currentNode.next!=null){
            //This wont print the last element hence we add one last print after the while loop
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
        System.out.println(currentNode.data);

    }
}
