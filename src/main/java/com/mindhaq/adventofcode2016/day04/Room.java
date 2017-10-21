package com.mindhaq.adventofcode2016.day04;

import lombok.Builder;
import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
@Builder
@Getter
public class Room {

    private final static Pattern CODE_PATTERN = Pattern.compile("^([a-z\\-]*)-(\\d*)\\[(.*)\\]$");

    private String name;

    private int sectorId;

    private String checksum;

    private boolean real;

    static Room fromCode(String code) {
        Matcher matcher = CODE_PATTERN.matcher(code);
        matcher.matches();

        return Room.builder()
                .checksum(matcher.group(3))
                .build();
    }
}
