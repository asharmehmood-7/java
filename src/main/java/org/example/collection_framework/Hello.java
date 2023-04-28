package org.example.collection_framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Hello {
    public static void main(String[] args) {


        // type safe  - same type of elements are added to collection
        // untype safe - different type of elements are added to collection

        //type safe
        ArrayList<String> names = new ArrayList<>();
        names.add("ashar");
        names.add("zain");
        names.add("mehmood");
       // System.out.println(names);
        //System.out.println(names.get(2)); // hence it is indexed collection
        //System.out.println(names.get(0)); // hence it is indexed collection
        names.add("mehmood"); // duplicates are allowed
        System.out.println(names);

//
//        //untype safe
//        LinkedList list = new LinkedList<>();
//
//        list.add("sachin");
//        list.add(101);
//        System.out.println(list);
//
//        ArrayList un = new ArrayList<>();
//        un.add("sachin");
//        un.add(1222201);
//        System.out.println(un);
        // to remove elements
        names.remove("mehmood");
        System.out.println(names);

        // size

        System.out.println(names.size());

        //check if present

        System.out.println(names.contains("ashar"));  // calls equals method of type(object)
        System.out.println(names.contains("pasha"));

        //check for empty
        System.out.println(names.isEmpty());

        //set value
        names.set(2,"akram");     // replaces
        System.out.println(names);

        //add
        names.add(3,"pasha");
        System.out.println(names);

        //remove all elements
        names.clear();

        System.out.println(names);

        Vector<String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println("vector " + vector);
        System.out.println("------------------------------------------------------");


        HashSet<Double> nms = new HashSet<>();   // no primitive types here   //the Double wrapper class provides an object representation of the double primitive type,
        nms.add(14.14);
//        nms.add(new Double(232.3));



    }
}
