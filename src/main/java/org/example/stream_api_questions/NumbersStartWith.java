package org.example.stream_api_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartWith {
    //22 ,222, 228, 2, 092,982,764

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(22 ,222,4423,23,4,444,471, 228, 2, 692,982,764);
        List<Integer>  nums =   numbers.stream().map(e->String.valueOf(e))
                .filter(e->e.startsWith("2"))
                .map(i->Integer.valueOf(i)).collect(Collectors.toList());
        System.out.println(nums);
    }
}
