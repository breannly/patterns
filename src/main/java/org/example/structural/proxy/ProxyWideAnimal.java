package org.example.structural.proxy;

public class ProxyWideAnimal implements Animal {

    private WideAnimal wideAnimal;
    private final String name;
    private final String sound;

    public ProxyWideAnimal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        if (wideAnimal == null) {
            System.out.println("Finding animal");
            wideAnimal = new WideAnimal(name, sound);
        }
        wideAnimal.makeSound();
    }

    public String getAdditionalInfo() {
        if (wideAnimal == null) {
            System.out.println("Finding animal");
            wideAnimal = new WideAnimal(name, sound);
        }
        return wideAnimal.getAdditionalInfo();
    }
}
