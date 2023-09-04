package org.example.behavioral.chainofresponsibility;

public class CreditRequest {

    private final double amount;

    public CreditRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
