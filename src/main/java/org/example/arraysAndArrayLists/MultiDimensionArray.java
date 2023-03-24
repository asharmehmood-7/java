package org.example.arraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr = new int[3][];   //rxc
//        int [][] arr2D = { {1,2,3},
//                        {5,6},
//                        {7,8,9}
//                        };

                int [][] arr2D = new int[3][3];   //rxc
      //  System.out.println(arr2D.length); // no of rows

        for (int row = 0; row<arr2D.length;row++){
            for (int col = 0; col < arr2D[row].length; col++ ){
                arr2D[row][col] = scanner.nextInt();
            }
        }

//        for (int row = 0; row<arr2D.length;row++){
//            for (int col = 0; col < arr2D[row].length; col++ ){
//                System.out.print(arr2D[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for (int row = 0; row  <arr2D.length; row++){
//            System.out.println(Arrays.toString(arr2D[row]));
//        }



        //enhanced for loop
        for(int[] row : arr2D ){
            System.out.println(Arrays.toString(row));  // num represents element of array
        }
    }

}
