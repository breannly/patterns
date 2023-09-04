package org.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFlavorFactory {

    private final Map<String, CoffeeFlavor> flavors = new HashMap<>();

    public CoffeeFlavor getCoffeeFlavor(String flavorName) {
        if (!flavors.containsKey(flavorName)) {
            flavors.put(flavorName, new CoffeeFlavor(flavorName));
        }
        return flavors.get(flavorName);
    }

    public int getTotalCoffeeFlavorsMade() {
        return flavors.size();
    }
}
