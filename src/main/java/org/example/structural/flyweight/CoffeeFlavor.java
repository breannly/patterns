package org.example.structural.flyweight;

public class CoffeeFlavor {

    private final String flavor;

    public CoffeeFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}
