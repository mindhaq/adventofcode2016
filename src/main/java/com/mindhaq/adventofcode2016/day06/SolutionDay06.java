package com.mindhaq.adventofcode2016.day06;

import com.mindhaq.adventofcode2016.Utils;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class SolutionDay06 {
    public static void main(String... args) {
        List<String> input = Utils.readInput(SolutionDay06.class);

        String message1 = RepetitionCounter.decrypt(input, 8, RepetitionCounter::findMostCommon);
        log.info("Solution part 1: {}", message1);

        String message2 = RepetitionCounter.decrypt(input, 8, RepetitionCounter::findLeastCommon);
        log.info("Solution part 2: {}", message2);
    }
}
