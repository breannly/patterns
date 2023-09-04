package org.example.structural.facade;

public class FacadeRunning {
    public static void main(String[] args) {
        HomeAutomationFacade facade = new HomeAutomationFacade();

        facade.leaveHome();
        System.out.println("\n-------------------------\n");
        facade.returnHome();
    }
}
