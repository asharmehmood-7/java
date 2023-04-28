package org.example.concepts.comparable_vs_comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortExample {
    public static void  main(String[] args) {

        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(new Employee("mehmood", 312, "123414"));
        emps.add(new Employee("ashar", 12, "123414"));
        System.out.println(emps);

        //Collections.sort(emps);  // gives error , need to specify comparator or comparable

        // suppose we dont have have integers here and have objects that we have to sort.
        //now on which property of the objects do we sort those objects ??
        // this is done with the help of comparators or comparables


        // comparator --> sort acc to multiple logics
        // comparable --> sort acc to single logic

        //implementing comparable

           // will call compareTo method in the background
        Collections.sort(emps);
        ArrayList<Employee> sortedEmployees = new ArrayList<>(emps);

        System.out.println(sortedEmployees);

    }
}
