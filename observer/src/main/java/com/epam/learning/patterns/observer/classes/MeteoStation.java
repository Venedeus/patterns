package com.epam.learning.patterns.observer.classes;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed {
    private int temperature;
    private int pressure;

    List<Observer> observers = new ArrayList<>();

    public void setMeasurements(int t, int p){
        temperature = t;
        pressure = p;

        notifyObservers();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer o: observers){
            o.handleEvent(temperature, pressure);
        }
    }
}
