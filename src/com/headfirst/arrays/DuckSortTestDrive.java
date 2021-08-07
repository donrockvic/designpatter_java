package com.headfirst.arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck [] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewe", 2),
                new Duck("Howard", 7),
                new Duck("Loouie", 3),
                new Duck("Donalnd", 10)
        };
        System.out.println("Before sorting....");
        display(ducks);

        arraysJava.sort(ducks);

        System.out.println("\n After sorting...");
        display(ducks);
    }

    public static void display(Duck[] ducks){
        for(Duck d: ducks)
            System.out.println(d);
    }

}
