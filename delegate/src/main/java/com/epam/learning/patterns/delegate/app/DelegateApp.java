package com.epam.learning.patterns.delegate.app;

import com.epam.learning.patterns.delegate.classes.Circle;
import com.epam.learning.patterns.delegate.classes.Painter;
import com.epam.learning.patterns.delegate.classes.Square;
import com.epam.learning.patterns.delegate.classes.Triangle;

public class DelegateApp {
    public static void main(String[] args) {
        Painter painter = new Painter();

        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();

        painter.setGraphics(new Circle());
        painter.draw();
    }
}