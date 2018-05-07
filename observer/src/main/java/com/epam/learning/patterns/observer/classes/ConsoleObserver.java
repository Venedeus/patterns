package com.epam.learning.patterns.observer.classes;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("Current weather:\n\ttemperature = " + temperature + "\n\tpressure = " + pressure);
    }
}
