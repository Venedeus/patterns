package com.epam.learning.patterns.abstractfactory.app;

import com.epam.learning.patterns.abstractfactory.classes.*;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("RU");
        Mouse mouse = factory.getMouse();
        Keyboard keyboard = factory.getKeyboard();
        Touchpad touchpad = factory.getTouchpad();

        mouse.click();
        keyboard.print();
        touchpad.track(1, 2);
    }

    private static DeviceFactory getFactoryByCountryCode(String lang){
        switch(lang){
            case "RU": return new RuDeviceFactory();
            case "EN": return new EnDeviceFactory();
            default: throw new RuntimeException("Unsupported Country Code: " + lang);
        }
    }
}
