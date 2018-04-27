package com.epam.learning.patterns.command.classes;

public class StartCommand implements Command{
    private Computer computer;

    public StartCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute(){
        computer.start();
    }
}
