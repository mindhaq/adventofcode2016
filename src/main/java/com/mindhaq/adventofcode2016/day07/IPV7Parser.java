package com.mindhaq.adventofcode2016.day07;

import java.util.stream.IntStream;

import static com.google.common.base.Preconditions.checkArgument;

public class IPV7Parser {

    public static final int ABBA_LENGTH = 4;

    public static boolean isAbba(String sequence) {
        checkArgument(sequence.length() == ABBA_LENGTH);

        return sequence.charAt(0) == sequence.charAt(3) &&
            sequence.charAt(1) == sequence.charAt(2) &&
            sequence.charAt(0) != sequence.charAt(1);
    }

    public static boolean containsAbba(String sequence) {
        checkArgument(sequence.length() >= ABBA_LENGTH);

        return IntStream
            .range(0, sequence.length() - ABBA_LENGTH + 1)
            .boxed()
            .map(ix -> sequence.substring(ix, ix + ABBA_LENGTH))
            .anyMatch(IPV7Parser::isAbba)
            ;
    }
}
