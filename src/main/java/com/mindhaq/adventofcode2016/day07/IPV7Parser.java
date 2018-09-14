package com.mindhaq.adventofcode2016.day07;

import static com.google.common.base.Preconditions.checkArgument;

public class IPV7Parser {
    public static boolean isAbba(String sequence) {
        checkArgument(sequence.length() == 4);

        return sequence.charAt(0) == sequence.charAt(3) &&
            sequence.charAt(1) == sequence.charAt(2) &&
            sequence.charAt(0) != sequence.charAt(1);
    }
}
