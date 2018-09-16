package com.mindhaq.adventofcode2016.day08;

public class RotateColumn implements Operation {

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

    private static boolean[] rotate(boolean[] sequence) {
        var rotatedSequence = new boolean[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            int rotatedIndex = (i + 1 == sequence.length) ? 0 : i + 1;
            rotatedSequence[rotatedIndex] = sequence[i];
        }
        return rotatedSequence;
    }
}
