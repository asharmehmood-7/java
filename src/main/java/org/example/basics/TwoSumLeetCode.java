package org.example.basics;

import java.util.ArrayList;

public class TwoSumLeetCode {
    public static   void main(String[] args) {
        int[] nums = {3,2,4};

        int[]  result  = twoSum(nums,6);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] intArray = new int[2];
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
//            System.out.println(nums[i] + "from i");
            for(int j=i+1;j<nums.length;j++){
//                System.out.println(nums[j]+"from j");
//                System.out.println(nums[i]+nums[j]  + "sum");
                if(nums[i]+nums[j] == target ){
                    intArray[0]=i;
                    intArray[1]=j;

                }
            }

        }
        System.out.println(intArray[1]);
        return intArray;
    }
}
