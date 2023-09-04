package org.example.behavioral.mediator;

public interface AnimalMediator {

    void feedAnimal(Animal animal, FoodType foodType);
    void addAnimal(Animal animal);
    void addFood(FoodType foodType, int quantity);
}
