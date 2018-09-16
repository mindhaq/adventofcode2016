package com.mindhaq.adventofcode2016.day08;

public class RotateColumn extends Rotate {

    private final int x;
    private final int pixels;

    public RotateColumn(int x, int pixels) {
        this.x = x;
        this.pixels = pixels;
    }

    @Override
    public void execute(Screen screen) {
        for (int i = 0; i < pixels; i++) {
            screen.setCol(x, rotate(screen.getCol(x)));
        }
    }

    public int getX() {
        return x;
    }

    public int getPixels() {
        return pixels;
    }
}
