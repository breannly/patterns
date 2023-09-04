package org.example.structural.bridge.color;

import org.example.structural.bridge.RedColor;
import org.example.structural.bridge.shape.Circle;
import org.example.structural.bridge.shape.Shape;
import org.example.structural.bridge.shape.Square;

public class BridgeRunner {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape greenCircle = new Circle(new GreenColor());
        Shape greenSquare = new Square(new GreenColor());
        Shape redSquare = new Square(new RedColor());

        redSquare.draw();
        greenCircle.draw();
        redCircle.draw();
        greenSquare.draw();
    }
}
