package org.example.behavioral.chainofresponsibility.employee;

import org.example.behavioral.chainofresponsibility.CreditRequest;

public abstract class BankEmployee {
    protected BankEmployee nextEmployee;

    public void setNextEmployee(BankEmployee nextEmployee) {
        this.nextEmployee = nextEmployee;
    }

    public abstract void processRequest(CreditRequest request);
}
