package org.example.behavioral.strategy;

public class StartegyRunning {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator(new SalaryTaxCalculation());

        double salaryIncome = 50000.0;
        double investmentIncome = 10000.0;

        double salaryTax = calculator.calculateTax(salaryIncome);
        double investmentTax = calculator.calculateTax(investmentIncome);

        System.out.println("Payroll tax: " + salaryTax);
        System.out.println("Tax on investment income: " + investmentTax);

        calculator.setStrategy(new InvestmentTaxCalculation());

        double newInvestmentTax = calculator.calculateTax(investmentIncome);
        System.out.println("The new tax on investment income: " + newInvestmentTax);
    }
}
