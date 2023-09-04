package org.example.behavioral.chainofresponsibility.employee;

import org.example.behavioral.chainofresponsibility.CreditRequest;

public class Manager extends BankEmployee {

    @Override
    public void processRequest(CreditRequest request) {
        if (request.getAmount() <= 50000) {
            System.out.println("The manager approves the loan for " + request.getAmount());
        } else if (nextEmployee != null) {
            nextEmployee.processRequest(request);
        }
    }
}
