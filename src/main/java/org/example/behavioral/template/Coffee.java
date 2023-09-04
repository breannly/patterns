package org.example.behavioral.template;

public class Coffee extends Beverage {

    @Override
    void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar and milk");
    }
}
