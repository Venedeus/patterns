package com.epam.learning.patterns.abstractfactory.classes;

public class EnMouse implements Mouse {
    public void click() {
        System.out.println("en: click");
    }

    public void dblclick() {
        System.out.println("en: double click");
    }

    public void scroll(int direction) {
        if(direction > 0) {
            System.out.println("en: scroll up");
        }
        else {
            System.out.println("en: scroll down");
        }
    }
}
