package org.example.linear_search.problems;

public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));


    }
    static int  findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if(even(num)){
               // System.out.println(num);
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        //count the no.of digits (n/10)
        //or convert num to string and get the length
        int numOfDigits = digits2(num);
        if(numOfDigits%2==0){
        //    System.out.println(num);
            return true;
        }else{
            return false;
        }

    }

    static int digits2(int num){
        return (int) (Math.log10(num)) + 1;
    }

    static int digits (int num){
        int count = 0;
        while (num > 0){
            count++;
            //System.out.println(num);
            num = num / 10;
        }
      //  System.out.println(count);
        return count;
    }
}


