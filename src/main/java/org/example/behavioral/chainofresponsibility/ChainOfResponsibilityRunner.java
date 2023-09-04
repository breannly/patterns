package org.example.behavioral.chainofresponsibility;

import org.example.behavioral.chainofresponsibility.employee.BankEmployee;
import org.example.behavioral.chainofresponsibility.employee.Clerk;
import org.example.behavioral.chainofresponsibility.employee.Director;
import org.example.behavioral.chainofresponsibility.employee.Manager;

public class ChainOfResponsibilityRunner {
    public static void main(String[] args) {
        BankEmployee clerk = new Clerk();
        BankEmployee manager = new Manager();
        BankEmployee director = new Director();

        clerk.setNextEmployee(manager);
        manager.setNextEmployee(director);

        CreditRequest request1 = new CreditRequest(8000);
        CreditRequest request2 = new CreditRequest(45000);
        CreditRequest request3 = new CreditRequest(90000);
        CreditRequest request4 = new CreditRequest(120000);


        clerk.processRequest(request1);
        clerk.processRequest(request2);
        clerk.processRequest(request3);
        clerk.processRequest(request4);
    }
}
