package com.mindhaq.adventofcode2016.day07;

import com.mindhaq.adventofcode2016.Utils;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class SolutionDay07 {

    public static void main(String[] args) {
        List<String> input = Utils.readInput(SolutionDay07.class);

        var solution1 = input
            .stream()
            .map(IPV7Parser::fromString)
            .filter(IPV7Address::supportsTLS)
            .count();
        log.info("Number of addresses supporting TLS: {}", solution1);

    }

}
