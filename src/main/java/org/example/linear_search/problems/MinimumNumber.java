package org.example.linear_search.problems;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {18,12,4,1,99,10};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i=1; i<arr.length;i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return  ans;
    }
}
