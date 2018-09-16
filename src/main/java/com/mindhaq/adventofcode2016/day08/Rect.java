package com.mindhaq.adventofcode2016.day08;

public class Rect implements Operation {

    private final int width;
    private final int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void execute(Screen screen) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                screen.set(x, y, true);
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
