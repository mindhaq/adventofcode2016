package com.mindhaq.adventofcode2016.day07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static com.google.common.base.Preconditions.checkArgument;

public class IPV7Parser {

    public static final int ABBA_LENGTH = 4;

    public static IPV7Address fromString(String s) {
        List<String> normalSequences = new ArrayList<>();
        List<String> hypernetSequences = new ArrayList<>();

        StringBuilder sequence = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '[') {
                normalSequences.add(sequence.toString());
                sequence = new StringBuilder();
            } else if (c == ']') {
                hypernetSequences.add(sequence.toString());
                sequence = new StringBuilder();
            } else {
                sequence.append(c);
            }
        }
        normalSequences.add(sequence.toString());

        return new IPV7Address(normalSequences, hypernetSequences);
    }

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
