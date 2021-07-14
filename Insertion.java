package com.codewithmelvin;
import java.util.*;
public class Insertion {
    public static void insertion( int arr[]){
        int i,key,j,temp;
        int arraySize=arr.length;
        for (i=1 ; i<arraySize; i++){
            key = arr[i];
            j=i-1;
            while ( j>=0 && key < arr[j]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }

            }
        System.out.println(Arrays.toString(arr));
        }


    public static void main(String[] args) {
        int arr[]={2,9,6,3,1,3};
        insertion(arr);

    }}
