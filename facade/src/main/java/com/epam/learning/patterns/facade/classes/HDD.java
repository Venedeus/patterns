package com.epam.learning.patterns.facade.classes;

public class HDD {
    public void copyFromDVD(DVDRom dvd){
        if(dvd.hasData()){
            System.out.println("Coping data from DVD.");
        }
        else{
            System.out.println("Insert DVD.");
        }
    }
}
