package org.example.sorting.cyclesortproblems;

import java.util.Arrays;
import java.util.List;

//Input: nums = [4,3,2,7,8,2,3,1]
//        Output: [5,6]

//[1,4,3]
//[]

public class DissapeardNumbers {


    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void findDisappearedNumbers(int[] nums) {

        int i = 0;
        while (i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){     //if the current element is greatest in array then leave it. //& nums[i] < nums.length
                swap(nums,i,correctIndex);
            }else {
                i++;
            }
        }



    }

    static  void swap (int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}

