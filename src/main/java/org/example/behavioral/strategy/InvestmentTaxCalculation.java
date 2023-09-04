package org.example.behavioral.strategy;

public class InvestmentTaxCalculation implements TaxCalculationStrategy {

    @Override
    public double calculateTax(double income) {
        return income * 0.1;
    }
}
