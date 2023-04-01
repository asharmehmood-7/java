package org.example.patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern5(5);

    }

    static void pattern5(int n) {
        int count = 1;
        for (int row = 1; row <= (2 * n) - 1; row++) {

            if (row <= n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            } else {
                for (int col2 = 1; col2 <= (n - count); col2++) {
                    System.out.print("* ");

                }
                count++;
            }

            System.out.println();
        }

    }


    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {  // or a col <= a constant num
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //after every row we want to break the line
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 0; col <= n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
