package com.mindhaq.adventofcode2016.day08;

public class Screen {

    private final boolean[][] pixels;
    private int width;
    private int height;

    public Screen() {
        this(50, 6);
    }

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        this.pixels = new boolean[this.width][this.height];
    }

    public boolean get(int x, int y) {
        return pixels[x][y];
    }

    public void set(int x, int y, boolean state) {
        pixels[x][y] = state;
    }

    public boolean[] getRow(int y) {
        var row = new boolean[width];
        for (int x = 0; x < width; x++) {
            row[x] = get(x, y);
        }
        
        return row;
    }
}
