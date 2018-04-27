package com.epam.learning.patterns.adapter.classes;

public class VectorAdapterFromRaster2 implements VectorGraphicsInterface{
    private RasterGraphics graphics = new RasterGraphics();

    @Override
    public void drawLine() {
        graphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        graphics.drawRasterSquare();
    }
}
