package com.mindhaq.adventofcode2016.day08;

public class RotateRow extends Rotate {

    private final int y;
    private final int pixels;

    public RotateRow(int y, int pixels) {
        this.y = y;
        this.pixels = pixels;
    }

    @Override
    public void execute(Screen screen) {
        for (int i = 0; i < pixels; i++) {
            screen.setRow(y, rotate(screen.getRow(y)));
        }
    }
}
