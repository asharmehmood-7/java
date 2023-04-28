package org.example.concepts.traversing_lists;

import java.util.ArrayList;
import java.util.List;

public class ListTraverse {

    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        listStr.add("ashar");
        listStr.add("zain");
        listStr.add("mehmood");

        for (int  i =0; i < listStr.size() ;i++){
            System.out.println(listStr.get(i));
        }
        System.out.println("----------------------------");

//        listStr.stream().map(i-> System.out.println(i.toUpperCase()));
    }




}
