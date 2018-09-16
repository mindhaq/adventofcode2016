package com.mindhaq.adventofcode2016.day08;

import static com.google.common.base.Preconditions.checkArgument;

public class Screen {

    private final boolean[][] pixels;
    private int width;
    private int height;

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

    public void setRow(int y, boolean[] row) {
        checkArgument(row.length == width);

        for (int x = 0; x < width; x++) {
            set(x, y, row[x]);
        }
    }

    public boolean[] getCol(int x) {
        var col = new boolean[height];
        for (int y = 0; y < height; y++) {
            col[y] = get(x, y);
        }

        return col;
    }

    public void setCol(int x, boolean[] col) {
        checkArgument(col.length == height);

        for (int y = 0; y < height; y++) {
            set(x, y, col[y]);
        }
    }

    public int countLit() {
        var count = 0;

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (get(x, y)) {
                    count++;
                }
            }
        }

        return count;
    }
}
