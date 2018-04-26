package com.epam.learning.patterns.abstractfactory.classes;

public class RuKeyboard implements Keyboard {
    public void print() {
        System.out.println("ru: print");
    }

    public void println() {
        System.out.println("ru: println");
    }
}
