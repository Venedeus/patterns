package com.epam.learning.patterns.factorymethod.app;

import com.epam.learning.patterns.factorymethod.classes.*;

public class FactoryMethodApp {
    public static void main(String[] args) {
        WatchMaker maker = getMakerByName("Digital");
        Watch watch = maker.createWatch();
        watch.showTime();

        maker = getMakerByName("Rome");
        watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker){
        if(maker.equals("Digital")){
            return new DigitalWatchMaker();
        }
        else
        {
            if(maker.equals("Rome")){
                return new RomeWatchMaker();
            }
        }

        throw new RuntimeException("Unknown type of watch maker: " + maker);
    }
}
