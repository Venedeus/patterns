package com.epam.learning.patterns.memento.classes;

public class File {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
