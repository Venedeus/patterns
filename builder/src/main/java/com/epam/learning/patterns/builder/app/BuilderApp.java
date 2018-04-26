package com.epam.learning.patterns.builder.app;

import com.epam.learning.patterns.builder.classes.*;

public class BuilderApp {
    public static void main(String[] args) {
        Car car = new CarBuilder().buildTitle("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(200)
                .build();

        System.out.println(car);

        Director director = new Director();

        director.setBuilder(new SubaruOutbackBuilder());
        car = director.buildCar();

        System.out.println(car);

        director.setBuilder(new FordMondeoBuilder());
        car = director.buildCar();
        
        System.out.println(car);

    }
}
