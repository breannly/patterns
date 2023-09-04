package org.example.creational.singleton;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Creating...");
            instance = new Singleton();
        }
        System.out.println("Getting...");
        return instance;
    }
}
