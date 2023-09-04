package org.example.structural.bridge;

import org.example.structural.bridge.color.Color;

public class RedColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("Using red");
    }
}
