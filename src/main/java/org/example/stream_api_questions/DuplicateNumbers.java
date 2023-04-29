package org.example.stream_api_questions;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22 ,22,222,4423,23,4,444,471,23,4,444,23, 228, 2, 692,982,764);
        Set<Integer> duplicates = numbers.stream().filter(e-> Collections.frequency(numbers,e)>1).collect(Collectors.toSet());
        System.out.println(duplicates);

        Set<Integer> dupNum = new HashSet<>();

    }
}
