package org.example.behavioral.state;

public class StateRunning {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.showState();

        trafficLight.changeState(new YellowState());
        trafficLight.showState();

        trafficLight.changeState(new RedState());
        trafficLight.showState();
    }
}
