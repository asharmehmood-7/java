package org.example.stream_api_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,422,23,3);
       Integer a =  numbers.stream().max(Comparator.comparing(i->Integer.valueOf(i))).get();
        System.out.println(a);

       Integer min  = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);
    }
}
