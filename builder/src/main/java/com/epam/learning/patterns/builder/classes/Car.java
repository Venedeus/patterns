package com.epam.learning.patterns.builder.classes;

public class Car {
    String title;
    Transmission transmission;
    int maxSpeed;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
