package org.example.binary_search.problems;

public class FindInMountainArray {

    public static void main(String[] args) {

    }

    static int findPeak(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while (start < end){

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]){
                end = mid; // as it is possible it is the largest element
            }
            else if (arr[mid] < arr[mid+1]) {
                start = mid + 1;
            }
        }
        return  start;
    }
}
