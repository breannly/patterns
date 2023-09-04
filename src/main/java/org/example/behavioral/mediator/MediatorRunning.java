package org.example.behavioral.mediator;

public class MediatorRunning {
    public static void main(String[] args) {
        AnimalMediator mediator = new AnimalMediatorImpl();

        Animal lion = new Lion(mediator, "Lion");
        Animal giraffe = new Giraffe(mediator, "Giraffe");

        mediator.addAnimal(lion);
        mediator.addAnimal(giraffe);

        mediator.addFood(FoodType.MEAT, 5);
        mediator.addFood(FoodType.PLANTS, 8);
        mediator.addFood(FoodType.FISH, 3);

        lion.eat(FoodType.MEAT);
        giraffe.eat(FoodType.PLANTS);
        lion.eat(FoodType.PLANTS);
        giraffe.eat(FoodType.MEAT);
    }

}
