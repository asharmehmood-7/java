package org.example.binary_search.problems;


public class SearchInMountainArray {

    public static void main(String[] args) {

    }

    static int search(int[] arr,int target){

        int peak = findPeakIndex(arr);
        int increasingSideIndex = orderAgnosticBinarySearch(arr,target,0,peak);
        if(increasingSideIndex != -1){
            return increasingSideIndex;
        }else {
            return orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
        }

    }

    static int orderAgnosticBinarySearch(int[] arr, int target,int start, int end) {


        boolean isAsc = arr[start] > arr[end];


        while (start <= end) {
            //find the middle element
//            int mid = (start + end)/2;  // might exceed the int limit in java
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }


        }
        return -1;
    }


    static int findPeakIndex(int[] arr){

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
