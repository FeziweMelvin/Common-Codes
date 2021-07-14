package com.codewithmelvin;
import java.util.*;

public class DublicateUnsorted {
    public static boolean dublicateTesterUnsorted(int arr[]) {//For unsorted list any integer array provided
        int arraySize = arr.length;
        for (int i = 0; i < arraySize; i++) {
            for (int k = i+1; k < arraySize ; k++) {//add 1 so we the j can start on the second element
                if (arr[i] == arr[k]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,7,5,8,1};
        System.out.println(dublicateTesterUnsorted(arr));
    }
}
