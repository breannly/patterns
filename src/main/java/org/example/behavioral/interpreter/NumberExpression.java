package org.example.behavioral.interpreter;

public class NumberExpression extends Expression {

    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public int interpret() {
        return number;
    }
}
