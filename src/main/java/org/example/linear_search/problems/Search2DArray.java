package org.example.linear_search.problems;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,1,4},
                {13,17,34},
                {88,9,3},

        };

        int target = 34;
        System.out.println(Arrays.toString(search2D(arr, target)));
        System.out.println(max(arr));

    }
    static int[] search2D(int[][] arr,int target){
        for (int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                if(arr[row][col]>max){
//                    return new int[]{row,col};
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
