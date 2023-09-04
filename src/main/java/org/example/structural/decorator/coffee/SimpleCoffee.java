package org.example.structural.decorator.coffee;

import org.example.structural.decorator.coffee.Coffee;

public class SimpleCoffee implements Coffee {

    @Override
    public double getCost() {
        return 2.0;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}
