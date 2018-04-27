package com.epam.learning.patterns.decorator.app;

import com.epam.learning.patterns.decorator.classes.*;

public class DecoratorApp {
    public static void main(String[] args) {
        Decorator printer =
                new RightBracketDecorator(
                        new LeftBracketDecorator(
                                new QuotesDecorator(
                                        new Printer("Hello World!"))));
        printer.print();
    }
}
