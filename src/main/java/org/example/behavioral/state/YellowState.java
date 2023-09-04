package org.example.behavioral.state;

public class YellowState implements State {

    @Override
    public void handle() {
        System.out.println("Traffic light switched to yellow");
    }
}
