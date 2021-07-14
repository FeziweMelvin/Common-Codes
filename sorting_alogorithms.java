package com.codewithmelvin;

import java.util.Arrays;

public class DataStructures {
    public static void insertion(int arr[]){
        long start_time=System.nanoTime();
        int i,key,j,temp;
        for(i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && key<arr[j]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j--;
            }
        }
        long end_time=System.nanoTime();
        System.out.println("Output sorted using insertion:"+end_time+ " " + Arrays.toString(arr));
    }
    public static void selection(int arr[]){
        int temp,min_index,i,j;
        for(i=0;i<arr.length;i++){
            min_index=i;
            for(j=i+1;j<arr.length ; j++){
                if(arr[j] <arr[i+1]){
                    min_index=j;
                }
            }
            temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Output sorted using selection : " + Arrays.toString(arr));
    }
    public static void bubble(int arr[]){
        long s=System.nanoTime();
        int j,i,temp;
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

        }}}
        System.out.println(Arrays.toString(arr));
        long e=System.nanoTime();
        long spent=e-s;
        System.out.println("Start"+ s);
        System.out.println("end"+ e);
        System.out.println("taken "+ spent);
    }
    public static void bubbleSort(int arr[],int n){
        long s=System.nanoTime();

        {
            // Base case
            if (n == 1)
                return;

            // One pass of bubble sort. After
            // this pass, the largest element
            // is moved (or bubbled) to end.
            else{
                for (int i=0; i<n-1; i++)
                    if (arr[i] > arr[i+1])
                    {
                        // swap arr[i], arr[i+1]
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                 }

                // Largest element is fixed,
                // recur for remaining array
                bubbleSort(arr, n-1);
            }
            System.out.println(Arrays.toString(arr));

            long e=System.nanoTime();
            long spent=e-s;
            System.out.println(" ");
            System.out.println("Start"+ s);
            System.out.println("end"+ e);
            System.out.println("taken "+ spent);
            System.out.println("");


    }}


    public static void main(String[] args) {
        int[] numbers={32,90,21};
        bubble(numbers);
        bubbleSort(numbers,3);
    }
}
