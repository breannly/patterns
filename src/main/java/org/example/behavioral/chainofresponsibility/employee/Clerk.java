package org.example.behavioral.chainofresponsibility.employee;

import org.example.behavioral.chainofresponsibility.CreditRequest;

public class Clerk extends BankEmployee {

    @Override
    public void processRequest(CreditRequest request) {
        if (request.getAmount() <= 10000) {
            System.out.println("The clerk approves the loan for " + request.getAmount());
        } else if (nextEmployee != null) {
            nextEmployee.processRequest(request);
        }
    }
}
