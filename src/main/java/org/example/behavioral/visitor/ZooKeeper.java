package org.example.behavioral.visitor;

public class ZooKeeper {

    void feed(Dog dog) {
        System.out.println("Покормили собаку");
    }

    void feed(Cat cat) {
        System.out.println("Покормили кошку");
    }

    void feed(Parrot parrot) {
        System.out.println("Покормили попугая");
    }

}
