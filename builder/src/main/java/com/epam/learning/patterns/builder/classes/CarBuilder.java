package com.epam.learning.patterns.builder.classes;

public class CarBuilder {
    private String title = "Default title";
    private Transmission transmission = Transmission.MANUAL;
    private int maxSpeed = 120;

    public CarBuilder buildTitle(String title){
        this.title = title;
        return this;
    }

    public CarBuilder buildTransmission(Transmission transmission){
        this.transmission = transmission;
        return this;
    }

    public CarBuilder buildMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
        return this;
    }

    public Car build(){
        Car car = new Car();
        car.setTitle(title);
        car.setTransmission(transmission);
        car.setMaxSpeed(maxSpeed);

        return car;
    }
}
