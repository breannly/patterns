package org.example.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class AnimalMediatorImpl implements AnimalMediator {
    private final Map<Animal, FoodType> animalFoodPreferences;
    private final Map<FoodType, Integer> availableFood;

    public AnimalMediatorImpl() {
        this.animalFoodPreferences = new HashMap<>();
        this.availableFood = new HashMap<>();
    }

    @Override
    public void feedAnimal(Animal animal, FoodType foodType) {
        FoodType preference = animalFoodPreferences.get(animal);
        if (preference != null && preference == foodType) {
            if (availableFood.containsKey(foodType) && availableFood.get(foodType) > 0) {
                System.out.println(animal.getName() + " has started eaten " + foodType);
                availableFood.put(foodType, availableFood.get(foodType) - 1);
                System.out.println(animal.getName() + " has finished eaten " + foodType);
            } else {
                System.out.println(animal.getName() + " hasn't found " + foodType + " для еды!");
            }
        } else {
            System.out.println(animal.getName() + " doesn't eat " + foodType);
        }
    }

    @Override
    public void addAnimal(Animal animal) {
        FoodType preference = animal.getFoodPreference();
        animalFoodPreferences.put(animal, preference);
    }

    @Override
    public void addFood(FoodType foodType, int quantity) {
        availableFood.put(foodType, availableFood.getOrDefault(foodType, 0) + quantity);
    }
}
