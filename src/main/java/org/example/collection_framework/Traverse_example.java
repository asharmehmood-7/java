package org.example.collection_framework;

import java.util.*;

public class Traverse_example {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("ashar");
        names.add("zain");
        names.add("mehmood");

        //list iterator , iterator , foreach ---> arraylist

        //foreach loop

        for (String str : names){
            System.out.print(str + " " + str.length()+" ");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }

        System.out.println("-------------------------------");

        Iterator<String> namesItr =  names.iterator();

        while (namesItr.hasNext()){
            String next = namesItr.next();
            System.out.println(next);
        }
        System.out.println("-------------------------------");

        // backward traversal using listIterator ---> for lists only

        ListIterator<String> namesLitr = names.listIterator(names.size());

        while (namesLitr.hasPrevious()){
            String prev = namesLitr.previous();
            System.out.println(prev);

        }

        // enumeration

        System.out.println("++++++++++++++++++++++++++++++++");
        // for each

        names.forEach(i-> System.out.println(i));
        System.out.println("++++++++++++++++++++++++++++++++");

        HashSet<Double> nms = new HashSet<>();   // no primitive types here   //the Double wrapper class provides an object representation of the double primitive type,
        nms.add(14.14);
//        nms.add(new Double(232.3));
        nms.add(34.1245);
        nms.add(234.1245);
        nms.add(392.2);

        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(nms);
        tset.add(6.0);
        System.out.println(tset);   // treeset is sorted

        Iterator<Double> titr = tset.iterator();

        while (titr.hasNext()){
            Double next = titr.next();
            System.out.println(next);
        }



    }
}
