package com.epam.learning.patterns.builder.classes;

public abstract class CarBuilderExt {
    private Car car;

    public void createCar(){
        car = new Car();
    }

    public abstract void buildTitle();
    public abstract void buildTransmission();
    public abstract void buildMaxSpeed();

    public Car getCar(){
        return car;
    }
}
