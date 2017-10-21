package com.mindhaq.adventofcode2016.day04;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoomTest {

    private final static String EXAMPLE1 = "aaaaa-bbb-z-y-x-123[abxyz]";

    @Test
    public void reads_checksum() {
        Room room = Room.fromCode(EXAMPLE1);

        assertThat(room.getChecksum()).isEqualTo("abxyz");
    }

    @Test
    public void reads_sectorId() {
        Room room = Room.fromCode(EXAMPLE1);

        assertThat(room.getSectorId()).isEqualTo(123);
    }

}
