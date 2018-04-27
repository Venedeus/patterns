package com.epam.learning.patterns.adapter.classes;

public class VectorAdapterFromRaster1 extends RasterGraphics implements VectorGraphicsInterface {
    public void drawLine() {
         drawRasterLine();
    }

    public void drawSquare() {
        drawRasterSquare();
    }
}
