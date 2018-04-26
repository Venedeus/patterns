package com.epam.learning.patterns.builder.classes;

public class Director {
    private CarBuilderExt builder;

    public void setBuilder(CarBuilderExt builder){
        this.builder = builder;
    }

    public Car buildCar(){
        builder.createCar();
        builder.buildTitle();
        builder.buildTransmission();
        builder.buildMaxSpeed();

        return builder.getCar();
    }
}
