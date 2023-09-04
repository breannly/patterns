package org.example.behavioral.state;

public class GreenState implements State {

    @Override
    public void handle() {
        System.out.println("Traffic light switched to green");
    }
}
