package org.example.arraysAndArrayLists.questions;

import java.util.Arrays;

// this is called the two pointer method.
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {7,1,2,3,4};
        reverseArray(arr);
    }
    static void reverseArray(int[] arr){
        int temp = 0;
        int start=0;
        int end=arr.length-1;
        while (start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
