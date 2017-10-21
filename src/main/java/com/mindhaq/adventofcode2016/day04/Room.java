package com.mindhaq.adventofcode2016.day04;

import com.google.common.collect.Multiset;
import lombok.Builder;
import lombok.Getter;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static com.google.common.collect.ImmutableMultiset.toImmutableMultiset;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
@Builder
@Getter
class Room {

    private final static Pattern CODE_PATTERN = Pattern.compile("^([a-z\\-]*)-(\\d*)\\[(.*)\\]$");

    private String name;

    private int sectorId;

    private String checksum;

    private boolean real;

    static Room fromCode(String code) {
        Matcher matcher = CODE_PATTERN.matcher(code);
        matcher.matches();

        String name = matcher.group(1);
        String checksum = matcher.group(3);
        Integer sectorId = Integer.valueOf(matcher.group(2));

        return Room.builder()
                .name(name)
                .sectorId(sectorId)
                .checksum(checksum)
                .real(checkIfReal(name, checksum))
                .build();
    }

    private static boolean checkIfReal(String name, String checksum) {
        return name
                .chars()
                .filter(c -> ((char)c != '-'))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(toImmutableMultiset())
                .entrySet()
                .stream()
                .sorted(byCountThenString())
                .limit(5)
                .map(Multiset.Entry::getElement)
                .collect(Collectors.joining())
                .equals(checksum);
    }

    private static Comparator<Multiset.Entry<String>> byCountThenString() {
        return Comparator.<Multiset.Entry<String>>comparingInt(Multiset.Entry::getCount).reversed()
                .thenComparing(Multiset.Entry::getElement);
    }

}
