package org.example.collection_framework;

import java.util.HashMap;
import java.util.TreeMap;

public class MyMaps {
    public static void main(String[] args) {

        HashMap<String , Integer> courses = new HashMap<>();
        //adding element
        courses.put("maths",200);
        courses.put("core ajva",4000);
        courses.put("basic python",3000);
        courses.put("android",100);
        courses.put("android",100);   // duplicates will not be in the map
        System.out.println(courses);   // order is not maintained  // also not sorting here
        courses.forEach((e1,e2)->{
            System.out.println(e1 + "=>" +e2);
        });

        System.out.println(courses.get("maths"));


        System.out.println("_________________________");



        TreeMap<String,Integer> my = new TreeMap<>();
        my.putAll(courses);
        System.out.println(my);

        System.out.println(my.get("basic python"));



    }
}
