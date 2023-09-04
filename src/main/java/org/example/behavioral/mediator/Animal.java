package org.example.behavioral.mediator;

public abstract class Animal {

    private final AnimalMediator mediator;
    private final String name;

    public Animal(AnimalMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract FoodType getFoodPreference();

    public void eat(FoodType foodType) {
        System.out.println(name + " has decided to eat " + foodType);
        mediator.feedAnimal(this, foodType);
    }

    public String getName() {
        return name;
    }

}
