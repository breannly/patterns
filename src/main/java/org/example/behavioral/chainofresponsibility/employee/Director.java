package org.example.behavioral.chainofresponsibility.employee;

import org.example.behavioral.chainofresponsibility.CreditRequest;

public class Director extends BankEmployee {

    @Override
    public void processRequest(CreditRequest request) {
        if (request.getAmount() <= 100000) {
            System.out.println("The director approves the loan for " + request.getAmount());
        } else {
            System.out.println("The loan for the amount " + request.getAmount() + " cannot be approved");
        }
    }
}
