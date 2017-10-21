package com.mindhaq.adventofcode2016.day04;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.Collection;

import static com.mindhaq.adventofcode2016.day04.RoomTest.EXAMPLE1;
import static com.mindhaq.adventofcode2016.day04.RoomTest.EXAMPLE2;
import static com.mindhaq.adventofcode2016.day04.RoomTest.EXAMPLE3;
import static com.mindhaq.adventofcode2016.day04.RoomTest.EXAMPLE4;
import static org.assertj.core.api.Assertions.assertThat;

public class RoomAnalyzerTest {

    @Test
    public void sums_sectorids_as_in_example() {
        Collection<String> roomListing = ImmutableList.of(
            EXAMPLE1, EXAMPLE2, EXAMPLE3, EXAMPLE4
        );
        RoomAnalyzer roomAnalyzer = new RoomAnalyzer(roomListing);

        assertThat(roomAnalyzer.getSumOfRealSectorIDs()).isEqualTo(1514);
    }

}
