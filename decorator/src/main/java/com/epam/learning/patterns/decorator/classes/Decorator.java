package com.epam.learning.patterns.decorator.classes;

public abstract class Decorator implements PrinterInterface {
    private PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }

    public void print() {
        component.print();
    }
}
