package com.mindhaq.adventofcode2016.day08;

public abstract class Rotate implements Operation {
    static boolean[] rotate(boolean[] sequence) {
        var rotatedSequence = new boolean[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            int rotatedIndex = (i + 1 == sequence.length) ? 0 : i + 1;
            rotatedSequence[rotatedIndex] = sequence[i];
        }
        return rotatedSequence;
    }
}
