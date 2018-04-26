package com.epam.learning.patterns.builder.classes;

public class SubaruOutbackBuilder extends CarBuilderExt {
    public void buildTitle() {
        getCar().setTitle("SubaruOutback");
    }

    public void buildTransmission() {
        getCar().setTransmission(Transmission.MANUAL);
    }

    public void buildMaxSpeed() {
        getCar().setMaxSpeed(180);
    }
}
