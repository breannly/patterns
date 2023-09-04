package org.example.behavioral.mediator;

public class Lion extends Animal {

    public Lion(AnimalMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public FoodType getFoodPreference() {
        return FoodType.MEAT;
    }
}

