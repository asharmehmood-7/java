package org.example.sorting.cyclesortproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  input [2,2]
// output [2,3]
//expected [2,1]
public class SetMisMatch {
    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(Arrays.toString(setMisMatch(nums)));
    }

    static int[] setMisMatch(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

        int difference = 0;
        int caught = 0;
        int actual = 0;
        int[] duplicates = new int[2];
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                caught = nums[j];
                actual = j+1;
                difference = actual - caught;

                if(caught<actual){
                    duplicates[count] = nums[j];
                    duplicates[count + 1] = actual;
                    break;
                }else{

                    duplicates[count] = nums[j];
                    duplicates[count + 1] = actual;
                    break;
                }

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
