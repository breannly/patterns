package org.example.creational.factorymethod.factory;

import org.example.creational.factorymethod.shape.Shape;
import org.example.creational.factorymethod.shape.Triangle;

public class TriangleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
