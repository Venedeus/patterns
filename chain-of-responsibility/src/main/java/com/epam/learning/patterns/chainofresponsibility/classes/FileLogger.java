package com.epam.learning.patterns.chainofresponsibility.classes;

import java.io.File;

public class FileLogger extends Logger {
    public FileLogger(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("File: " + message);
    }
}
