package com.epam.learning.patterns.decorator.classes;

public class LeftBracketDecorator extends Decorator {
    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    public void print() {
        System.out.print("(");
        super.print();
    }
}
