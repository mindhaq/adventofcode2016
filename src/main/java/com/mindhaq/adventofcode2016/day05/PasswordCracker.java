package com.mindhaq.adventofcode2016.day05;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
                .collect(Collectors.joining())
                ;
    }
}
