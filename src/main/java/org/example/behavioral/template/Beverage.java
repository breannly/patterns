package org.example.behavioral.template;

public abstract class Beverage {

    public void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boil a water");
    }

    public void pourInCup() {
        System.out.println("Pour in cup");
    }
}
