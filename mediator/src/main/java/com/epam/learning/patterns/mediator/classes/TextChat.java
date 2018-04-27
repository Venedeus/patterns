package com.epam.learning.patterns.mediator.classes;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if(admin != null && admin instanceof Admin) {
            this.admin = admin;
        }
        else {
            throw new RuntimeException("Not enough rights.");
        }
    }

    public void addUser(User user){
        if(admin == null) {
            throw new RuntimeException("There is not admin in the chat.");
        }

        if(user instanceof SimpleUser) {
            users.add(user);
        }
        else{
            throw new RuntimeException("Admin can administrate only one chat.");
        }
    }

    public void sendMessage(String message, User user) {
        if(user instanceof Admin){
            for(User u: users){
                u.getMessage(user.getName() + ": " + message);
            }
        }

        if(user instanceof SimpleUser){
            for(User u: users){
                if(u != user && u.isEnable()){
                    u.getMessage(user.getName() + ": " + message);
                }
            }

            if(admin.isEnable()){
                admin.getMessage(user.getName() + ": " + message);
            }
        }
    }
}
