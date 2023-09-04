package org.example.creational.factorymethod;

import org.example.creational.factorymethod.factory.CircleFactory;
import org.example.creational.factorymethod.factory.ShapeFactory;
import org.example.creational.factorymethod.factory.SquareFactory;
import org.example.creational.factorymethod.factory.TriangleFactory;
import org.example.creational.factorymethod.shape.Shape;

public class ShapeRunner {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.draw();

        ShapeFactory triangleFactory = new TriangleFactory();
        Shape triangle = triangleFactory.createShape();
        triangle.draw();
    }
}
