package com.mindhaq.adventofcode2016.day04;

import java.util.Collection;
import java.util.stream.Collectors;

class RoomsAnalyzer {

    private final Collection<Room> roomListing;

    private final int sumOfRealSectorIDs;

    private RoomDefinitionParser roomDefinitionParser = new RoomDefinitionParser();

    private RoomNameDecrypter roomNameDecrypter = new RoomNameDecrypter();

    RoomsAnalyzer(Collection<String> roomDefinitions) {
        this.roomListing =
                roomDefinitions.stream()
                .map(roomDefinitionParser::fromCode)
                .collect(Collectors.toList());

        sumOfRealSectorIDs = roomListing
                .stream()
                .filter(Room::isReal)
                .mapToInt(Room::getSectorId)
                .sum();
    }

    int getSumOfRealSectorIDs() {
        return sumOfRealSectorIDs;
    }

    void decryptRoomNames() {
        roomListing.forEach(room -> {
            String decryptedName = roomNameDecrypter.decrypt(room.getName(), room.getSectorId());
            System.out.println(String.format("%d: %s", room.getSectorId(), decryptedName));
        });

    }
}
