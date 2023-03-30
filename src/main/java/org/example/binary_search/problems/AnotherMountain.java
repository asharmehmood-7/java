package org.example.binary_search.problems;

public class AnotherMountain {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 8;
        int a = find(arr,target);
        System.out.println(a);

    }

    static int find(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start < end){

            int mid = start + (end - start) / 2;

            if (arr[mid] > target){
                end = mid-1; // as it is possible it is the largest element
            }
            else if (arr[mid] < target ) {
                start = mid + 1;
            }


        }if(arr[start]==target){
            return start;
        }else{
            return  -1;
        }

    }
}
