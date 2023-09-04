package org.example.behavioral.state;

public class TrafficLight {

    private State state;

    public TrafficLight() {
        this.state = new GreenState();
    }

    public void changeState(State newState) {
        this.state = newState;
    }

    public void showState() {
        state.handle();
    }
}
