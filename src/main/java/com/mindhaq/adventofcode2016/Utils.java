package com.mindhaq.adventofcode2016;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.io.Resources.getResource;
import static com.google.common.io.Resources.readLines;

public abstract class Utils {
    private Utils() {
    }

    public static List<String> readInput(Class<?> contextClass) {
        try {
            return readLines(getResource(contextClass, "input.txt"), UTF_8);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
