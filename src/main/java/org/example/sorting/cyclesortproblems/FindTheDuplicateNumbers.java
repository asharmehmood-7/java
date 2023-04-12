package org.example.sorting.cyclesortproblems;


//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//        There is only one repeated number in nums, return this repeated number.
//
//        You must solve the problem without modifying the array nums and uses only constant extra space.
//

//Input: nums = [1,3,4,2,2]
//        Output: 2
//
//take XOR of all the numbers.You will get the sum with out the duplicated number.
//
//        (sum of all n - above sum) will give you the number   --> check this approach too


import java.util.Arrays;

public class FindTheDuplicateNumbers {
    public static void main(String[] args) {

        int[] nums = {3,1,3,4,2};
      int result =   findDuplicate(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(result);
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
//            int correctIndex = nums[j] - 1;
            if (nums[j] != j + 1) {
                return nums[j];
            }
        }

        return -1;


    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
