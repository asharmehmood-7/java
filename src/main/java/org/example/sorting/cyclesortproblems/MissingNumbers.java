package org.example.sorting.cyclesortproblems;

import java.util.Arrays;

public class MissingNumbers {

    public static void main(String[] args) {
        int[] arr = {1,0,3};
        System.out.println(sort(arr));
        System.out.println(Arrays.toString(arr));

    }

//    static int missingNum(int[]){
//
//    }

    static int sort(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < arr.length) {

            //case 1 when last element is in the array
////
//            if (arr[arr.length - 1] == n  ) {
//                break;
//            }
            // it starts from zero so index == value;

//            if(i==n-1){
//                break;
//            }

            if (arr[i] == n) {
                i++;                        // getting error here
            }

            int correct = arr[i];

            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }


        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return n;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
