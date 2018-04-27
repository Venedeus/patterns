package com.epam.learning.patterns.chainofresponsibility.app;

import com.epam.learning.patterns.chainofresponsibility.classes.*;

public class ChainOfResponsibilityApp {
    public static void main(String[] args) {
        Logger smsLogger = new SMSLogger(Level.ERROR);
        Logger fileLogger = new FileLogger(Level.DEBUG);
        Logger emailLogger = new EmailLogger(Level.INFO);

        smsLogger.setNext(fileLogger);
        fileLogger.setNext(emailLogger);

        smsLogger.writeMessage("Error", 1);
        System.out.println("----------");
        smsLogger.writeMessage("Debug", 2);
        System.out.println("----------");
        smsLogger.writeMessage("Info", 3);
    }
}
