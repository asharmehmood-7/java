package org.example.arraysAndArrayLists;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(2);
        list.add(67);
        list.add(27);
        list.add(17);
        list.add(37);
        list.add(47);
        list.set(0,99);
        System.out.println(list);
    }
}
