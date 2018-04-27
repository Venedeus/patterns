package com.epam.learning.patterns.mediator.app;

import com.epam.learning.patterns.mediator.classes.Admin;
import com.epam.learning.patterns.mediator.classes.SimpleUser;
import com.epam.learning.patterns.mediator.classes.TextChat;
import com.epam.learning.patterns.mediator.classes.User;

public class MediatorApp {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat, "Jenya");
        User user1 = new SimpleUser(chat, "Petya");
        User user2 = new SimpleUser(chat, "Vasya");
        User user3 = new SimpleUser(chat, "Sasha");

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user3.setEnable(false);
        user1.sendMessage("Hello, I'm " + user1.getName() + ".");
        admin.sendMessage("Admin " + admin.getName() + " entered the chat.");
    }
}
