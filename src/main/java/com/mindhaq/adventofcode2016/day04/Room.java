package com.mindhaq.adventofcode2016.day04;

import lombok.Builder;
import lombok.Getter;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
@Builder
@Getter
class Room {

    private String name;

    private int sectorId;

    private String checksum;

    private boolean real;

}
