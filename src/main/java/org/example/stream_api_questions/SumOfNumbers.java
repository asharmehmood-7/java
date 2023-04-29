package org.example.stream_api_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(16);list.add(9);list.add(2);list.add(4);

        // reduce -> pass a lambda
        Optional<Integer> sum =  list.stream().reduce((a, b)->a+b);
        System.out.println("sum is "+ sum.get());

        System.out.println("+++++++++++++++++++++");

        double avg = list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);
    }

}
