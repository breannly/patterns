package org.example.structural.facade;

public class HomeAutomationFacade {

    private final LightSystem lightSystem;
    private final HeatingSystem heatingSystem;

    public HomeAutomationFacade() {
        this.lightSystem = new LightSystem();
        this.heatingSystem = new HeatingSystem();
    }

    public void leaveHome() {
        lightSystem.turnOff();
        heatingSystem.heatOff();
        System.out.println("The house is empty");
    }

    public void returnHome() {
        lightSystem.turnOn();
        heatingSystem.heatOn();
        System.out.println("The house is not empty");
    }
}
