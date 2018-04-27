package com.epam.learning.patterns.mediator.classes;

public abstract class User {
    private Chat chat;
    private String name;
    private boolean isEnable = true;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message){
        chat.sendMessage(message, this);
    }

    public abstract void getMessage(String message);

}
