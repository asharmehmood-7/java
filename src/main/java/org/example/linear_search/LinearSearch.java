package org.example.linear_search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,55,22,3,83,22,5,278,2,62,12};
        int target = 278;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr , int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        //if target not found
        return -1;
    }
}
