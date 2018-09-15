package com.mindhaq.adventofcode2016.day07;

import com.mindhaq.adventofcode2016.Utils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SolutionDay07 {

    public static void main(String[] args) {
        var input = Utils.readInput(SolutionDay07.class);

        var solution1 = input
            .stream()
            .map(IPV7Parser::fromString)
            .filter(IPV7Address::supportsTLS)
            .count();
        log.info("Number of addresses supporting TLS: {}", solution1);

        var solution2 = input
            .stream()
            .map(IPV7Parser::fromString)
            .filter(IPV7Address::supportsSSL)
            .count();
        log.info("Number of addresses supporting SSL: {}", solution2);
    }
}
