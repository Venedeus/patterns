package com.epam.learning.patterns.chainofresponsibility.classes;

public abstract class Logger {
    private int priority;
    private Logger next;

    public Logger(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public Logger getNext() {
        return next;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    public void writeMessage(String message, int level) {
        if(level <= getPriority()){
            write(message);
        }

        if(getNext() != null){
            getNext().writeMessage(message, level);
        }
    }

    public abstract void write(String message);
}
