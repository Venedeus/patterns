package com.epam.learning.patterns.factorymethod.classes;

import java.util.Date;

public class DigitalWatch implements Watch {
    public void showTime() {
        System.out.println(new Date());
    }
}
