package org.example.sorting.cyclesortproblems;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));

    }

   static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }

        List<Integer> duplicates = new ArrayList<>();

        for (int j = 0; j<nums.length;j++){
            if(nums[j]!=j+1){
                duplicates.add(nums[j]);
            }
        }

        return duplicates;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
