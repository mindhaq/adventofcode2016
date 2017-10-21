package com.mindhaq.adventofcode2016.day04;

import java.util.Collection;

class RoomAnalyzer {


    private final Collection<String> roomListing;

    private int sumOfRealSectorIDs;

    RoomAnalyzer(Collection<String> roomListing) {
        this.roomListing = roomListing;

        sumOfRealSectorIDs = roomListing.stream()
                .map(Room::fromCode)
                .filter(Room::isReal)
                .mapToInt(Room::getSectorId)
                .sum();
    }

    int getSumOfRealSectorIDs() {
        return sumOfRealSectorIDs;
    }
}
