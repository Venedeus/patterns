package com.epam.learning.patterns.observer.classes;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class FileObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        File file;

        try{
            file = File.createTempFile("weather_".toString(), ".txt");
            PrintWriter pw = new PrintWriter(file);
            pw.println("Current weather:");
            pw.println("\n\ttemperature = " + temperature);
            pw.println("\n\tpressure = " + pressure);
            pw.println();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
