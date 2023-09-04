package org.example.structural.flyweight;

public class FlyweightRunning {
    public static void main(String[] args) {
        CoffeeFlavorFactory flavorFactory = new CoffeeFlavorFactory();

        CoffeeFlavor coffee1 = flavorFactory.getCoffeeFlavor("Cappuccino");
        CoffeeFlavor coffee2 = flavorFactory.getCoffeeFlavor("Espresso");
        CoffeeFlavor coffee3 = flavorFactory.getCoffeeFlavor("Cappuccino");
        CoffeeFlavor coffee4 = flavorFactory.getCoffeeFlavor("Latte");

        System.out.println("Total coffee flavors made: " + flavorFactory.getTotalCoffeeFlavorsMade());
    }
}
