package org.example.creational.factorymethod.factory;

import org.example.creational.factorymethod.shape.Shape;
import org.example.creational.factorymethod.shape.Square;

public class SquareFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Square();
    }
}
