package com.epam.learning.patterns.prototype.classes;

public class Human implements Copyable {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object copy() {
        Human copy = new Human(age, name);

        return copy;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
