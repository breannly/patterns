package org.example.structural.proxy;

public class WideAnimal implements Animal {

    private final String name;
    private final String sound;
    private String additionalInfo;

    public WideAnimal(String name, String sound) {
        this.name = name;
        this.sound = sound;
        loadAdditionalInfo();
    }

    private void loadAdditionalInfo() {
        additionalInfo = "Info about an animal " + name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound: " + sound);
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }
}
