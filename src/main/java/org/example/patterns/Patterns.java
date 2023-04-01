package org.example.patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern3(5);

    }


    static void pattern1(int n){
        for (int row = 1; row <= n; row++ ){

            for (int col = 1; col<=n; col++){  // or a col <= a constant num
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n ; row++ ){
            for (int col = 1; col<= row; col++  ){
                System.out.print("* ");
            }
            //after every row we want to break the line
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++){

            for (int col = 0; col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
