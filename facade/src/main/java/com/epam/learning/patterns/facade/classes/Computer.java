package com.epam.learning.patterns.facade.classes;

public class Computer {
    private Power power = new Power();
    private DVDRom dvd = new DVDRom();
    private HDD hdd = new HDD();

    public void copy(){
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
}
