package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BmpInfo {
    private List<RGB> colors = new ArrayList<>();
    private byte pixelSize;
    private short height;
    private short width;

    public List<RGB> getColors() {
        return colors;
    }

    public void setColors(List<RGB> colors) {
        this.colors = colors;
    }

    public void addColor(RGB b) {
        colors.add(b);
    }

    public float getPixelSize() {
        return pixelSize;
    }

    public void setPixelSize(byte pixelSize) {
        this.pixelSize = pixelSize;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }

    public short getWidth() {
        return width;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "colors=" + colors +
                ", pixelSize=" + pixelSize +
                ", height=" + height +
                ", width=" + width;
    }
}
