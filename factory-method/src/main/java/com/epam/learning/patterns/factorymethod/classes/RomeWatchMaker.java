package com.epam.learning.patterns.factorymethod.classes;

public class RomeWatchMaker implements WatchMaker {
    public Watch createWatch() {
        return new RomeWatch();
    }
}
