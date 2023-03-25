package org.example.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-99, -44, -6, 0, 2, 3, 6, 21, 52, 98};
        int[] arr2 = {98,52,21,6,3,1,0,-99};

        int ans = binarySearch(arr2, 21);
        System.out.println(ans);
    }

    static boolean isAsc(int[] arr) {
        if (arr[0] < arr[arr.length-1]) {
            return true;
        } else {
            return false;
        }
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            //find the middle element
//            int mid = (start + end)/2;  // might exceed the int limit in java
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc(arr)) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }


        }
        return -1;
    }
}
