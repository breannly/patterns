package org.example.behavioral.state;

public class RedState implements State {

    @Override
    public void handle() {
        System.out.println("Traffic light switched to red");
    }
}
