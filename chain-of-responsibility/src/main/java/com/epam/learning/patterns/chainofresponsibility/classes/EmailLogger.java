package com.epam.learning.patterns.chainofresponsibility.classes;

public class EmailLogger extends Logger {
    public EmailLogger(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("Email: " + message);
    }
}
