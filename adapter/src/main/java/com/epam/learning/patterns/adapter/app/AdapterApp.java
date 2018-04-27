package com.epam.learning.patterns.adapter.app;

import com.epam.learning.patterns.adapter.classes.VectorAdapterFromRaster1;
import com.epam.learning.patterns.adapter.classes.VectorAdapterFromRaster2;
import com.epam.learning.patterns.adapter.classes.VectorGraphicsInterface;

public class AdapterApp {
    public static void main(String[] args) {
        VectorGraphicsInterface graphics = new VectorAdapterFromRaster1();
        graphics.drawLine();
        graphics.drawSquare();

        graphics = new VectorAdapterFromRaster2();
        graphics.drawLine();
        graphics.drawSquare();
    }
}
