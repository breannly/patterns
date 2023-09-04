package org.example.creational.factorymethod.factory;

import org.example.creational.factorymethod.shape.Circle;
import org.example.creational.factorymethod.shape.Shape;

public class CircleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
