package com.company;

public class Stuff {

    // Set count to zero initially, shared by all instances of this class
    static int count = 0;
    private static String city = "Austin";

    // Use this to store an ID for each object
    int id;

    public Stuff() {

        // Every time the constructor runs, increment count.
        count = count + 1;

        // Set the object ID using count.
        id = count;
        System.out.println("Created object with id " + id);
    }

    // This just returns the ID.
    public int getId() {
        return id;
    }


    public static void main(String[] args){
        Stuff a = new Stuff();
        Stuff b = new Stuff();
        Stuff c = new Stuff();

        System.out.println("You can access count with the class name " + Stuff.count);
        System.out.println("You can also access count by calling with the instance variables: " + a.count + " " + b.count);
        // System.out.println("Cannot access private static variables: " + Stuff.city);
    }

}
