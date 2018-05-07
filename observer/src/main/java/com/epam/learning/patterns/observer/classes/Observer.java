package com.epam.learning.patterns.observer.classes;

public interface Observer {
    void handleEvent(int temperature, int pressure);
}
