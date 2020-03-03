package com.company;

public class BmpHeader {
    private int bfSize;
    private int bfOffBits;
    private String bfType;

    public int getBfSize() {
        return bfSize;
    }

    public void setBfSize(int bfSize) {
        this.bfSize = bfSize;
    }

    public int getBfOffBits() {
        return bfOffBits;
    }

    public void setBfOffBits(int bfOffBits) {
        this.bfOffBits = bfOffBits;
    }

    public String getBfType() {
        return bfType;
    }

    public void setBfType(String bfType) {
        this.bfType = bfType;
    }

    @Override
    public String toString() {
        return "bfSize = " + bfSize +
                ", bfOffBits = " + bfOffBits +
                ", bfType = " + bfType;
    }
}
