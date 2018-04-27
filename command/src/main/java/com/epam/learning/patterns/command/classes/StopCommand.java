package com.epam.learning.patterns.command.classes;

public class StopCommand implements Command {
    private Computer computer;

    public StopCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.stop();
    }
}
