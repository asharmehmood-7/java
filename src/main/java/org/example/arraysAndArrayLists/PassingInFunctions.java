package org.example.arraysAndArrayLists;
import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {1,6,3,4};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change (int[] arr){
        arr[0] = 99;
    }
}
