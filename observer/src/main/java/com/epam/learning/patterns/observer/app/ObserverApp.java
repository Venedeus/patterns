package com.epam.learning.patterns.observer.app;

import com.epam.learning.patterns.observer.classes.ConsoleObserver;
import com.epam.learning.patterns.observer.classes.FileObserver;
import com.epam.learning.patterns.observer.classes.MeteoStation;
import com.epam.learning.patterns.observer.classes.Observed;

public class ObserverApp {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();

        station.addObserver(new ConsoleObserver());
        station.addObserver(new FileObserver());

        station.setMeasurements(25, 760);
        station.setMeasurements(-5, 745);
    }
}
