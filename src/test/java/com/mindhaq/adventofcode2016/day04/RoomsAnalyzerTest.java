package com.mindhaq.adventofcode2016.day04;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.Collection;

import static com.mindhaq.adventofcode2016.day04.RoomDefinitionParserTest.EXAMPLE1;
import static com.mindhaq.adventofcode2016.day04.RoomDefinitionParserTest.EXAMPLE2;
import static com.mindhaq.adventofcode2016.day04.RoomDefinitionParserTest.EXAMPLE3;
import static com.mindhaq.adventofcode2016.day04.RoomDefinitionParserTest.EXAMPLE4;
import static org.assertj.core.api.Assertions.assertThat;

public class RoomsAnalyzerTest {

    @Test
    public void sums_sectorids_as_in_example() {
        Collection<String> roomListing = ImmutableList.of(
            EXAMPLE1, EXAMPLE2, EXAMPLE3, EXAMPLE4
        );
        RoomsAnalyzer roomsAnalyzer = new RoomsAnalyzer(roomListing);

        assertThat(roomsAnalyzer.getSumOfRealSectorIDs()).isEqualTo(1514);
    }

}
