package com.mindhaq.adventofcode2016.day07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkArgument;

public class IPV7Parser {

    public static final int ABBA_LENGTH = 4;
    public static final int ABA_LENGTH = 3;

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

        return subSequenceStream(sequence, ABBA_LENGTH)
            .anyMatch(IPV7Parser::isAbba)
            ;
    }

    static Stream<String> subSequenceStream(String sequence, int length) {
        return IntStream
            .range(0, sequence.length() - length + 1)
            .boxed()
            .map(ix -> sequence.substring(ix, ix + length));
    }

    public static boolean isAba(String sequence) {
        checkArgument(sequence.length() == ABA_LENGTH);

        return sequence.charAt(0) == sequence.charAt(2) &&
            sequence.charAt(0) != sequence.charAt(1);
    }

    public static boolean isBabOf(String sequence, String aba) {
        checkArgument(isAba(aba), "%s is no ABA", aba);

        return isAba(sequence) &&
            sequence.charAt(0) == aba.charAt(1) &&
            sequence.charAt(1) == aba.charAt(0);
    }

    public static Stream<String> findAbas(String sequence) {
        checkArgument(sequence.length() >= ABA_LENGTH);

        return subSequenceStream(sequence, ABA_LENGTH)
            .filter(IPV7Parser::isAba);
    }

    public static String toBab(String aba) {
        checkArgument(isAba(aba), "%s is no ABA", aba);

        return new StringBuilder()
            .append(aba.charAt(1))
            .append(aba.charAt(0))
            .append(aba.charAt(1))
            .toString();
    }
}
