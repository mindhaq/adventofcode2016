package com.mindhaq.adventofcode2016.day08;

public class Screen {

    private final boolean[][] pixels;

    public Screen() {
        this(50, 6);
    }

    public Screen(int width, int height) {
        pixels = new boolean[width][height];
    }

    public boolean get(int x, int y) {
        return pixels[x][y];
    }

    public void set(int x, int y, boolean state) {
        pixels[x][y] = state;
    }
}
