package com.mindhaq.adventofcode2016.day06;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class RepetitionCounterTest {

    public static final String[] EXAMPLE_COLUMN = {
        "e",
        "d",
        "e",
        "r",
        "a",
        "t",
        "s",
        "r",
        "n",
        "n",
        "s",
        "t",
        "v",
        "v",
        "d",
        "e"
    };
    public static final List<String> EXAMPLE_MESSAGE = List.of(
        "eedadn",
        "drvtee",
        "eandsr",
        "raavrd",
        "atevrs",
        "tsrnev",
        "sdttsa",
        "rasrtv",
        "nssdts",
        "ntnada",
        "svetve",
        "tesnvt",
        "vntsnd",
        "vrdear",
        "dvrsen",
        "enarar"
    );

    @Test
    public void find_most_common() {
        // given
        Stream<String> column = Arrays.stream(EXAMPLE_COLUMN);

        // when
        String found = RepetitionCounter.findMostCommon(column);

        // then
        assertThat(found).isEqualTo("e");
    }

    @Test
    public void find_least_common() {
        // given
        Stream<String> column = Arrays.stream(EXAMPLE_COLUMN);

        // when
        String found = RepetitionCounter.findLeastCommon(column);

        // then
        assertThat(found).isEqualTo("a");
    }

    @Test
    public void decrypt_example_word_part1() {
        // given
        List<String> input = EXAMPLE_MESSAGE;

        // when
        String message = RepetitionCounter.decrypt(input, 6, RepetitionCounter::findMostCommon);

        // then
        assertThat(message).isEqualTo("easter");
    }

    @Test
    public void decrypt_example_word_part2() {
        // given
        List<String> input = EXAMPLE_MESSAGE;

        // when
        String message = RepetitionCounter.decrypt(input, 6, RepetitionCounter::findLeastCommon);

        // then
        assertThat(message).isEqualTo("advent");
    }
}
