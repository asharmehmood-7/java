package org.example.arraysAndArrayLists;

import java.sql.Array;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //array of primitives
        int[] arr = new int[3];

//        for(int i = 0; i < arr.length; i++){
//            arr[i] = scanner.nextInt();
//        }

        //System.out.println(arr.toString());


//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
        //enhanced for loop
//        for(int num : arr ){
//            System.out.println(num);  // num represents element of array
//        }
//        System.out.println(Arrays.toString(arr));

        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = scanner.next();
        }
        System.out.println(str[2]);

        //modify
        str[1] = "aa";
        

















    }
}
