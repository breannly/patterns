package org.example.behavioral.strategy;

public class SalaryTaxCalculation implements TaxCalculationStrategy {

    @Override
    public double calculateTax(double income) {
        return income * 0.2;
    }
}
