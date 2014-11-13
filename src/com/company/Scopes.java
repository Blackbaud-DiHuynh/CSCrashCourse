package com.company;

/**
 * Created by dihuynh on 11/11/14.
 */
public class Scopes {


    public static void main (String[] args){
        int x = 0;
        String s = "A new string";
        int[] array = new int[1];
        array[0] = 0;

        //cannot declare another variable named x and s in this scope
        //String s = "something else";

        addOne(x);
        System.out.println("X is now: " + x);

        addOne(s);
        System.out.println("S is now: " + s);

        addOne(array);
        System.out.println("Array is now: " + array[0]);
    }

    private static void addOne (int x){
        x = x + 1;
    }

    private static void addOne (String s){
        s = s + " 1";
    }

    private static void addOne (int[] array){
        array[0] = 12;
    }
}
