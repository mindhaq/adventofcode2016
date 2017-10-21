package com.mindhaq.adventofcode2016.day04;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoomTest {

    static final String EXAMPLE1 = "aaaaa-bbb-z-y-x-123[abxyz]";
    static final String EXAMPLE2 = "a-b-c-d-e-f-g-h-987[abcde]";
    static final String EXAMPLE3 = "not-a-real-room-404[oarel]";
    static final String EXAMPLE4 = "totally-real-room-200[decoy]";

    @Test
    public void reads_name() {
        Room room = Room.fromCode(EXAMPLE1);

        assertThat(room.getName()).isEqualTo("aaaaa-bbb-z-y-x");
    }
    @Test
    public void reads_sectorId() {
        Room room = Room.fromCode(EXAMPLE1);

        assertThat(room.getSectorId()).isEqualTo(123);
    }

    @Test
    public void reads_checksum() {
        Room room = Room.fromCode(EXAMPLE1);

        assertThat(room.getChecksum()).isEqualTo("abxyz");
    }

    @Test
    public void checks_reality() {
        Room room = Room.fromCode(EXAMPLE1);

        assertThat(room.isReal()).isTrue();
    }

    @Test
    public void it_parses_second_example() {
        Room room = Room.fromCode(EXAMPLE2);

        assertThat(room.getName()).isEqualTo("a-b-c-d-e-f-g-h");
        assertThat(room.getSectorId()).isEqualTo(987);
        assertThat(room.getChecksum()).isEqualTo("abcde");
        assertThat(room.isReal()).isTrue();
    }

    @Test
    public void it_parses_third_example() {
        Room room = Room.fromCode(EXAMPLE3);

        assertThat(room.getName()).isEqualTo("not-a-real-room");
        assertThat(room.getSectorId()).isEqualTo(404);
        assertThat(room.getChecksum()).isEqualTo("oarel");
        assertThat(room.isReal()).isTrue();
    }

    @Test
    public void it_parses_fourth_example() {
        Room room = Room.fromCode(EXAMPLE4);

        assertThat(room.getName()).isEqualTo("totally-real-room");
        assertThat(room.getSectorId()).isEqualTo(200);
        assertThat(room.getChecksum()).isEqualTo("decoy");
        assertThat(room.isReal()).isFalse();
    }

}
