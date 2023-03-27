package org.example.binary_search.problems;

public class Floor {

    public static void main(String[] args) {

        int[] arr = {2,3,5,11,14,16,18};
        int target = 15;
        int ans = floor(arr,target);
        System.out.println(ans);
    }

    //greatest no. less than equal to target
    static int floor(int[] arr, int target){


        //what if the target is smaller than the smallest element in the array
        if (target > arr[0]){
            return  -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return  end;
    }
}
