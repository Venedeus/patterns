package com.epam.learning.patterns.abstractfactory.classes;

public class EnTouchpad implements Touchpad {
    public void track(int deltaX, int deltaY) {
        System.out.println("en: track on " + (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }
}
