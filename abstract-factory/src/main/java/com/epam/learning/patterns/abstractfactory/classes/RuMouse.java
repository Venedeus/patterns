package com.epam.learning.patterns.abstractfactory.classes;

public class RuMouse implements Mouse {
    public void click() {
        System.out.println("ru: click");
    }

    public void dblclick() {
        System.out.println("ru: double click");
    }

    public void scroll(int direction) {
        if(direction > 0) {
            System.out.println("ru: scroll up");
        }
        else {
            System.out.println("ru: scroll down");
        }
    }
}
