package org.example.behavioral.template;

public class Tea extends Beverage {

    @Override
    void brew() {
        System.out.println("Brewing tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Add lemon");
    }
}
