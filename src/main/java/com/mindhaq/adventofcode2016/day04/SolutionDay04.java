package com.mindhaq.adventofcode2016.day04;

import com.mindhaq.adventofcode2016.Utils;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class SolutionDay04 {

    public static void main(String[] args) {
        final List<String> readLines = Utils.readInput(SolutionDay04.class);
        RoomsAnalyzer roomsAnalyzer = new RoomsAnalyzer(readLines);

        log.info("Sum of real rooms is {}", roomsAnalyzer.getSumOfRealSectorIDs());

        roomsAnalyzer.decryptRoomNames();
    }

}
