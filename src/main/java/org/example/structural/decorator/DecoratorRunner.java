package org.example.structural.decorator;

import org.example.structural.decorator.coffee.Coffee;
import org.example.structural.decorator.coffee.SimpleCoffee;
import org.example.structural.decorator.decorator.MilkDecorator;
import org.example.structural.decorator.decorator.SugarDecorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: $" + coffee.getCost() + ", Ingredients: " + coffee.getIngredients());

        coffee = new MilkDecorator(coffee);
        System.out.println("Cost: $" + coffee.getCost() + ", Ingredients: " + coffee.getIngredients());

        coffee = new SugarDecorator(coffee);
        System.out.println("Cost: $" + coffee.getCost() + ", Ingredients: " + coffee.getIngredients());
    }
}
