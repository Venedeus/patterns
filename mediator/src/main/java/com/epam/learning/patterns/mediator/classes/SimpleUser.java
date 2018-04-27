package com.epam.learning.patterns.mediator.classes;

public class SimpleUser extends User {
    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    public void getMessage(String message) {
        System.out.println(getName() + " gets a message: \"" + message + "\"");
    }
}
