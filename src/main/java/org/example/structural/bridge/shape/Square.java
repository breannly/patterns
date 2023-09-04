package org.example.structural.bridge.shape;

import org.example.structural.bridge.color.Color;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing square - ");
        color.applyColor();
    }
}
