package org.example.behavioral.mediator;

public class Giraffe extends Animal {

    public Giraffe(AnimalMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public FoodType getFoodPreference() {
        return FoodType.PLANTS;
    }
}
