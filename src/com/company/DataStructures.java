package com.company;

import java.util.*;

public class DataStructures {

    public static void main(String[] args) {
        primitives();
        //arrays();
        //arrayList();
        //maps();
    }

    public static void primitives(){
        int wholeNumber = 12;               // default: 0
        double realNumber = 1.3;
        long largerWholeNumber = 31564879455L;
        boolean isPrimitive = true;         // default: false
        float largerRealNumber = 2.3452f;

        System.out.println ("Integer division only returns the whole number: " + 5/2);
        System.out.println ("Operations involving ints and doubles will return a double: " + 5/2.0);
    }

    private static void arrays() {
        // <type>[] <name> = new <type>[<size>]
        int[] numbers = new int[9];
        boolean[] truthValues = new boolean[12];

        // random assignment
        numbers[3] = 139;

        // random access for valid indices
        System.out.println ("We can access the nth element by using the index: " + numbers[3]);
        System.out.println ("We cannot access a bad index: " + numbers[-1]);
    }

    private static void arrayList() {
        // ArrayList<type> <name> = new ArrayList<type>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(133);

        // random access for valid indices
        System.out.println ("\nWe can access the nth element by using the index: " + list.get(0) + "\n");
        list.set(0, 13);
        System.out.println("\nWe can access the nth element by using the index: " + list.get(0) + "\n");
        // error
        System.out.println ("We cannot access a bad index: " + list.get(-1));
    }

    private static void maps(){
        //Map<type of key, type of value> <name> = new Map<type of key, type of value>();
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Andy", 1);
        map.put("Gary", 12);

        System.out.println("We can get all the values in the map: " + map.values() + " and keys " + map.keySet());
        System.out.println("We can get value for specific key " + map.get("Andy"));

        // to get all the keys individually, we need to iterate through the map
        for (String key : map.keySet()){
            System.out.println("Key " + key + " is mapped to " + map.get(key));
        }
    }
}
