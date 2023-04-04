package org.example.linear_search.problems;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Candies {

    public static void main(String[] args) {
        int[] a = {12,1,12};
        int b = 10;
        List<Boolean> result  =  kidsWithCandies(a,b);
        System.out.println(result);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       ArrayList<Boolean> result = new ArrayList<>();

       for (int k = 0; k < candies.length; k++){
           result.add(true);
       }

       for (int i = 0; i < candies.length;i++){
           //result.add(true);

           int check = candies[i]+extraCandies;
           System.out.println(check);

           for(int j = 0; j < candies.length; j++){


               if(candies[j]>check){
                   result.set(i,false);
                   break;

               }

           }
           System.out.println("i "+ i);
           if(result.get(i)!=false){result.set(i,true);}


       }
        //System.out.println(Arrays.toString(candies));
       return  result;
    }
}