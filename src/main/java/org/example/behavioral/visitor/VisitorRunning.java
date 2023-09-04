package org.example.behavioral.visitor;

public class VisitorRunning {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Parrot parrot = new Parrot();

        zooKeeper.feed(dog);
        zooKeeper.feed(cat);
        zooKeeper.feed(parrot);
    }
}
