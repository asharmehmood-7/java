package org.example.stream_api_questions;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamQuestions {
    public static void main(String[] args) {

       //Question # 1 :  count occurrence of each character in a string

        String input = "asharmehmood";

        //convert string to string array

        String[] results = input.split("");
        //System.out.println(Arrays.toString(results));
        Map<String, Long> map =  Arrays.stream(results).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));  // group by each character
        System.out.println(map);



    }
}
