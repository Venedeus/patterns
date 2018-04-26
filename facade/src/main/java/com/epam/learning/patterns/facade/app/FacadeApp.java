package com.epam.learning.patterns.facade.app;

import com.epam.learning.patterns.facade.classes.Computer;

public class FacadeApp {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.copy();
    }
}
