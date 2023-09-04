package org.example.behavioral.interpreter;

public class InterpreterRunning {
    public static void main(String[] args) {
        Expression expression = new AddExpression(
                new NumberExpression(1),
                new AddExpression(new NumberExpression(2), new NumberExpression(3))
        );

        int result = expression.interpret();
        System.out.println("Result: " + result);
    }
}
