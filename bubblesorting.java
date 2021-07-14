package com.codewithmelvin;

import java.util.Arrays;
class BubbleSort
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 100, 25, 1, 22, 11, 90};
        System.out.println("unSorted array");
        System.out.println(Arrays.toString(arr));
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));

    }}