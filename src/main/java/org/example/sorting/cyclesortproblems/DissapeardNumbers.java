package org.example.sorting.cyclesortproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input: nums = [4,3,2,7,8,2,3,1]
//        Output: [5,6]

//[1,4,3]
//[]

//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
//


public class DissapeardNumbers {


    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
     //   findDisappearedNumbers(nums);
      //  System.out.println(Arrays.toString(nums));
        System.out.println(findDisappearedNumbers(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;
        while (i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]  ){     //if the current element is greatest in array then leave it. //& nums[i] < nums.length
                swap(nums,i,correctIndex);
            }else {
                i++;
            }
        }

       List<Integer> missingNumbers = new ArrayList<>();

        for (int j = 0; j < nums.length;j++){
            int correctIndex = nums[j] - 1;
//            System.out.println("correct index "+ correctIndex);
//            System.out.println("correct value "+ nums[j]);

            if (nums[j]!=j+1){
                missingNumbers.add(j+1);
            }

        }
        return missingNumbers;

    }


    static  void swap (int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}

