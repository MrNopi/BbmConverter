package com.company;

public class BmpFile {
    BmpInfo bmpInfo;
    BmpHeader bmpHeader;

    public BmpFile(BmpInfo bmpInfo, BmpHeader bmpHeader) {
        this.bmpInfo = bmpInfo;
        this.bmpHeader = bmpHeader;
    }

    public BmpInfo getBmpInfo() {
        return bmpInfo;
    }

    public void setBmpInfo(BmpInfo bmpInfo) {
        this.bmpInfo = bmpInfo;
    }

    public BmpHeader getBmpHeader() {
        return bmpHeader;
    }

    public void setBmpHeader(BmpHeader bmpHeader) {
        this.bmpHeader = bmpHeader;
    }

    @Override
    public String toString() {
        return "BmpFile{" +
                "bmpInfo=" + bmpInfo +
                ", bmpHeader=" + bmpHeader +
                '}';
    }
}
