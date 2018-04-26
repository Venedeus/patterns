package com.epam.learning.patterns.builder.classes;

public class FordMondeoBuilder extends CarBuilderExt {
    public void buildTitle() {
        getCar().setTitle("Ford Mondeo");
    }

    public void buildTransmission() {
        getCar().setTransmission(Transmission.AUTO);
    }

    public void buildMaxSpeed() {
        getCar().setMaxSpeed(260);
    }
}
