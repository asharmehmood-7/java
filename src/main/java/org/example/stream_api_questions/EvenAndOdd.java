package org.example.stream_api_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,422,23,3);
        List<Integer> even =  numbers.stream().filter(e->e%2==0)
                .collect(Collectors.toList());
        System.out.println(even);

        List<Integer> odd =  numbers.stream().filter(e->e%2!=0)
                .collect(Collectors.toList());
        System.out.println(odd);

    }

}
