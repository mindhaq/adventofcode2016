package com.mindhaq.adventofcode2016.day05;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
@Slf4j
public class PasswordCracker {

    private final String doorId;

    public PasswordCracker(String doorId) {
        this.doorId = doorId;
    }

    public String crack() {
        return IntStream
                .range(0, Integer.MAX_VALUE)
                .boxed()
                .map(i -> doorId + i)
                .map(Hash::new)
                .filter(Hash::isInteresting)
                .peek(hash -> log.info("Found {}", hash))
                .map(Hash::getToken)
                .limit(8)
                .collect(joining())
                ;
    }

    public String crackWithOrder() {
        Map<Integer, String> password = new HashMap<>(8);
        int count = 0;

        while (password.size() < 8) {
            String code = doorId + count;
            Hash hash = new Hash(code);
            if (hash.isInterestingPosition()) {
                log.info("Found {}", hash);
                password.computeIfAbsent(hash.getPosition(), integer -> hash.getTokenAtPosition().toString());
            }
            count++;
        }

        return password
                .entrySet()
                .stream()
                .sorted(Comparator.comparingInt(Map.Entry::getKey))
                .map(Map.Entry::getValue)
                .collect(joining());
    }
}
