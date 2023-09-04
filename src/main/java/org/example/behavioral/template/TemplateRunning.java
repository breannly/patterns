package org.example.behavioral.template;

public class TemplateRunning {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("Preparing tea:");
        tea.prepareBeverage();

        System.out.println("\n-----------------\n");

        System.out.println("Preparing coffee:");
        coffee.prepareBeverage();
    }
}
