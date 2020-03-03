package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferByte;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BmpReader {
    public void read(String inputFileName, String outputFileName) throws IOException {
        BufferedInputStream file = new BufferedInputStream(new FileInputStream(inputFileName));
        String type = new String(file.readNBytes(2));
        if (!type.toLowerCase().contains("bm")) {
            throw new IOException("It's not a bmp file or you enter wrong path");
        }
        BufferedImage img = ImageIO.read(new File(inputFileName));
        ColorModel colorModel = img.getColorModel();
        BmpInfo bmpInfo = convertBmpToBmpInfo(img);
        BmpHeader bmpHeader = convertBmpToBmpHeader(img);
        bmpHeader.setBfType(type);
        for (int i = 0; i < bmpHeader.getBfSize(); i++) {
            RGB color = new RGB(colorModel.getRed(i),
                    colorModel.getGreen(i),
                    colorModel.getBlue(i));
            bmpInfo.addColor(color);
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName + ".json"));
        writer.write(bmpHeader.toString());
        writer.close();
        writer = new BufferedWriter(new FileWriter(outputFileName + "Info.json"));
        writer.write(bmpInfo.toString());
        writer.close();
        System.out.format("Done, two files was created: %1$s.json with minimal information about file\n%1$sInfo.json with additional information\n", outputFileName);
    }

    private BmpHeader convertBmpToBmpHeader(BufferedImage img) {
        DataBufferByte buffer = (DataBufferByte) img.getRaster().getDataBuffer();
        BmpHeader bmpHeader = new BmpHeader();
        bmpHeader.setBfOffBits(buffer.getOffset());
        bmpHeader.setBfSize(buffer.getSize());
        return bmpHeader;
    }

    private BmpInfo convertBmpToBmpInfo(BufferedImage img) {
        BmpInfo bmpInfo = new BmpInfo();
        bmpInfo.setHeight((short)img.getHeight());
        bmpInfo.setWidth((short)img.getWidth());
        bmpInfo.setPixelSize((byte) img.getColorModel().getPixelSize());
        return bmpInfo;
    }
}
