package com.codewithmelvin;
//2^n -1
public class Towerofhanoi {
    public static String towerOfHanoi(int numberOfDisk, String sourceDisk ,String toDisk, String destinationDisk) {
        if (numberOfDisk==1){
            System.out.println( "Move disk 1 from rod " + sourceDisk + "to rod " + destinationDisk);
            return "";
        }
        else
            towerOfHanoi(numberOfDisk-1,sourceDisk,destinationDisk,toDisk);
            System.out.println("Move disk "+ (numberOfDisk-1) + " from rod " + sourceDisk + " to rod " + toDisk);
            towerOfHanoi(numberOfDisk-1, destinationDisk, toDisk, sourceDisk);
            return "" ;

    }

    public static void main (String[] args){
        towerOfHanoi(3,"A","B","C");



    }
}
