package org.example.stream_api_questions;

import java.util.ArrayList;

public class SquareAverage {


    //get avg of squares which are greater than 100
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(16);list.add(9);list.add(2);list.add(4);

      double avg =   list.stream().map(e -> e*e)
                                    .filter(e->e>100).
                                        mapToInt(e->e).
                                            average().
                                                getAsDouble();
        System.out.println(avg);

    }
}
