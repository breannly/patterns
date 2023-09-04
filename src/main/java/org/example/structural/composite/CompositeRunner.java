package org.example.structural.composite;

import org.example.structural.composite.shape.Circle;
import org.example.structural.composite.shape.Group;
import org.example.structural.composite.shape.Square;

public class CompositeRunner {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        Group group = new Group();
        group.addShape(circle);
        group.addShape(square);

        Group largerGroup = new Group();
        largerGroup.addShape(circle);
        largerGroup.addShape(group);

        circle.draw();
        System.out.println("\n----------------------------\n");
        square.draw();
        System.out.println("\n----------------------------\n");
        group.draw();
        System.out.println("\n----------------------------\n");
        largerGroup.draw();
    }
}
