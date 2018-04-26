package com.epam.learning.patterns.factorymethod.classes;

public class DigitalWatchMaker implements WatchMaker {
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
