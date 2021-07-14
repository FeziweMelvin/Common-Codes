package com.codewithmelvin;
import java.util.*;
import java.io.*;

public class ArraylistRevision {
    public static void main(String[] args) {
        String name= "My name , My age , Grade";
        String[] nameArray=name.split("e");
        System.out.println(Arrays.toString(nameArray));
        System.out.println(nameArray[0]);
    }
    }