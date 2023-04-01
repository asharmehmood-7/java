package org.example.recursion;

public class RecursionBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,23,88};
        int target = 23;
        int a = search(arr,target,0,arr.length-1);
        System.out.println(a);
    }
    static int search(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if (arr[m]==target){
            return m;
        }
        if (arr[m]>target){
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,e);
    }
}
