package com.epam.learning.patterns.prototype.app;

import com.epam.learning.patterns.prototype.classes.Human;
import com.epam.learning.patterns.prototype.classes.HumanFactory;

public class PrototypeApp {
    public static void main(String[] args) {
        Human original = new Human(18, "Vasya");
        System.out.println(original);

        Human copy = (Human) original.copy();
        System.out.println(copy);

        HumanFactory factory = new HumanFactory(original);
        System.out.println(factory.makeCopy());
        System.out.println(factory.makeCopy());
        System.out.println(factory.makeCopy());
        System.out.println(factory.makeCopy());
        System.out.println(factory.makeCopy());
        System.out.println(factory.makeCopy());
        System.out.println(factory.makeCopy());
    }
}
