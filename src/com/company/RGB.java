package com.company;

public class RGB {
    private int red;
    private int greed;
    private int blue;

    public RGB(int red, int greed, int blue) {
        this.red = red;
        this.greed = greed;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreed() {
        return greed;
    }

    public void setGreed(int greed) {
        this.greed = greed;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "red=" + red +
                ", greed=" + greed +
                ", blue=" + blue +
                "}\n";
    }
}
