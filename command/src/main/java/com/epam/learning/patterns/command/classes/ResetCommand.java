package com.epam.learning.patterns.command.classes;

public class ResetCommand implements Command {
    private Computer computer;

    public ResetCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.reset();
    }
}
