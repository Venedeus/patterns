package com.epam.learning.patterns.abstractfactory.classes;

public class RuTouchpad implements Touchpad {
    public void track(int deltaX, int deltaY) {
        System.out.println("ru: track on " + (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }
}
