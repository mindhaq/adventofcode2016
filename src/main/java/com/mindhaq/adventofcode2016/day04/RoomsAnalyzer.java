package com.mindhaq.adventofcode2016.day04;

import java.util.Collection;
import java.util.stream.Collectors;

class RoomsAnalyzer {

    private final Collection<Room> roomListing;

    private final int sumOfRealSectorIDs;

    private RoomDefinitionParser roomDefinitionParser = new RoomDefinitionParser();

    RoomsAnalyzer(Collection<String> roomDefinitions) {
        this.roomListing =
                roomDefinitions.stream()
                .map(roomDefinitionParser::fromCode)
                .collect(Collectors.toList());

        sumOfRealSectorIDs =
                roomListing
                .stream()
                .filter(Room::isReal)
                .mapToInt(Room::getSectorId)
                .sum();
    }

    int getSumOfRealSectorIDs() {
        return sumOfRealSectorIDs;
    }
}
