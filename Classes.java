package com.codewithmelvin;

import java.util.*;

public class Classes{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //Object of Student Class
        Student person1=new Student("Melvin","Shongwe","0102275613085",20,"F",3);

        //Object of Lecture Class
        Lecturer lecturer1 = new Lecturer("Deon" , "Solomon" , "76030682836463" , 44, "M" , "MAT211 Adv Calc" );
        lecturer1.printSummary();
    }
}
class Human{
    //Fields Of the Class (human)
    String name;
    String surname;
    String idNumber;
    String gender;
    int age;

    //Constructor
    public Human(String name,String surname,String idNumber,int age,String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.idNumber = idNumber;
        this.gender = gender;
    }
    //Printing Method
    public void printSummary() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Id Number: " + idNumber);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

}
//Student Class Inherit from Human Class
class Student extends Human {
    int yearLevel;

    public Student(String name, String surname, String idNumber, int age, String gender,int yearLevel) {
        super(name, surname, idNumber, age, gender);

    }

    }

class Lecturer extends Human {
    String courseName;

    public Lecturer(String name, String surname, String idNumber, int age, String gender, String courseName) {
        super(name, surname, idNumber, age, gender);
    }

    }


