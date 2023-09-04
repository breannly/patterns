package org.example.structural.composite.shape;

import java.util.ArrayList;
import java.util.List;

public class Group implements Shape {

    private final List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void draw() {
        System.out.println("Group of shapes:");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
