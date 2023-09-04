package org.example.behavioral.observer;

public class ObserverRunning {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        Observer observer3 = new ConcreteObserver("Observer 3");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.setMessage("Message 1");
        subject.setMessage("Message 2");

        subject.removeObserver(observer2);

        subject.setMessage("Сообщение 3");
    }
}
