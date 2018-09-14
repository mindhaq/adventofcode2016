package com.mindhaq.adventofcode2016.day06;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RepetitionCounter {
    public static String findMostCommon(Stream<String> column) {
        return findCharacter(column, Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed());
    }

    public static String findLeastCommon(Stream<String> column) {
        return findCharacter(column, Comparator.comparing(Map.Entry<String, Integer>::getValue));
    }

    private static String findCharacter(Stream<String> column, Comparator<Map.Entry<String, Integer>> decryptionStrategy) {
        return column
            .collect(
                () -> new HashMap<String, Integer>(),
                (m, s) -> m.merge(s, 1, (i1, i2) -> i1 + i2),
                HashMap::putAll
            )
            .entrySet()
            .stream()
            .sorted(decryptionStrategy)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElseThrow()
            ;
    }

    public static String decrypt(List<String> input, int wordLength, Function<Stream<String>, String> columnDecryptor) {
        return IntStream.range(0, wordLength)
            .boxed()
            .map(ix -> readColumn(input, ix))
            .map(columnDecryptor)
            .collect(Collectors.joining())
            ;
    }

    private static Stream<String> readColumn(List<String> input, Integer ix) {
        return input
            .stream()
            .map(s -> Character.toString(s.charAt(ix)))
            ;
    }
}
