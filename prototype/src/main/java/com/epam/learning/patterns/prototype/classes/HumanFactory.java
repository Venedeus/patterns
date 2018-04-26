package com.epam.learning.patterns.prototype.classes;

public class HumanFactory {
    private Human human;

    public HumanFactory(Human human) {
        this.human = human;
    }

    public void setPrototype(Human human){
        this.human = human;
    }

    public Human makeCopy(){
        return (Human) human.copy();
    }
}
