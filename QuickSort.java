package com.codewithmelvin;
import java.util.*;

public class QuickSort {
    public static int partition(int arr[],int low,int high){//Low and High reffered to the indexes of the arrays
        int pivot=arr[high];//Making the last element pivot
        int i = (low-1);

        for (int j = low; j<high;j++){
            if (arr[j] < pivot){
                i++;

                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;}
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }
    public static void Quick(int arr[] ,int low , int high){
        if (low < high) {
            int pi = partition(arr, low, high);
            Quick(arr, low, pi - 1);
            Quick(arr, pi + 1, high);
        }
    }
    public static void println(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i<n-1;i++)
            System.out.println(arr[i]);
}

    public static void main(String[] args) {
        int arr[]={10,7,8,9,1,5};
        Quick(arr,0,arr.length-1);
        println(arr);
    }
}