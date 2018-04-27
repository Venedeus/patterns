package com.epam.learning.patterns.mediator.classes;

public class Admin extends User {
    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    public void getMessage(String message) {
        System.out.println("Admin " + getName() + " gets a message: \"" + message + "\"");
    }
}
