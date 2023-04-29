package org.example.stream_api_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,422,23,3);
        List<Integer> asc =   numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(asc);


    }
}
