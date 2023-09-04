package org.example.behavioral.strategy;

public class TaxCalculator {

    private TaxCalculationStrategy strategy;

    public TaxCalculator(TaxCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateTax(double income) {
        return strategy.calculateTax(income);
    }

    public void setStrategy(TaxCalculationStrategy strategy) {
        this.strategy = strategy;
    }
}
