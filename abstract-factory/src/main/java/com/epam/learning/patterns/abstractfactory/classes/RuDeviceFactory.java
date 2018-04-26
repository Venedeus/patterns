package com.epam.learning.patterns.abstractfactory.classes;

public class RuDeviceFactory implements DeviceFactory {
    public Mouse getMouse() {
        return new RuMouse();
    }

    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}
