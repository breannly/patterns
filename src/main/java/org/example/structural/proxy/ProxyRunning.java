package org.example.structural.proxy;

public class ProxyRunning {
    public static void main(String[] args) {
        Animal lion = new ProxyWideAnimal("Lion", "rrrrr");

        lion.makeSound();
        System.out.println(lion.getAdditionalInfo());
    }
}
