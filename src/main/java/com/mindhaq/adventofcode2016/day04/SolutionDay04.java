package com.mindhaq.adventofcode2016.day04;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.io.Resources.getResource;
import static com.google.common.io.Resources.readLines;

@Slf4j
public class SolutionDay04 {

    public static void main(String[] args) throws IOException {
        final List<String> readLines = readLines(getResource(SolutionDay04.class, "input.txt"), UTF_8);
        RoomsAnalyzer roomsAnalyzer = new RoomsAnalyzer(readLines);

        log.info("Sum of real rooms is {}", roomsAnalyzer.getSumOfRealSectorIDs());
    }

}
