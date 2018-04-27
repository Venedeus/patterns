package com.epam.learning.patterns.composite.app;

import com.epam.learning.patterns.composite.classes.*;

public class CompositeApp {
    public static void main(String[] args) {
        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 = new Composite();

        composite.addComponent(composite1);
        composite.addComponent(composite2);
        composite.addComponent(composite3);
        composite1.addComponent(new Circle());
        composite1.addComponent(new Circle());
        composite1.addComponent(new Circle());
        composite2.addComponent(new Square());
        composite2.addComponent(new Square());
        composite2.addComponent(new Square());
        composite3.addComponent(new Triangle());

        composite.draw();
    }
}
