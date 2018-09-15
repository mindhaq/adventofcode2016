package com.mindhaq.adventofcode2016.day07;

import org.junit.Test;

import static com.mindhaq.adventofcode2016.day07.IPV7Parser.fromString;
import static org.assertj.core.api.Assertions.assertThat;

public class IPV7ParserTest {

    @Test(expected = IllegalArgumentException.class)
    public void require_four_characters() {
        IPV7Parser.isAbba("abbba");
    }

    @Test
    public void check_abba_is_abba() {
        var sequence = "abba";

        assertThat(IPV7Parser.isAbba(sequence)).isTrue();
    }

    @Test
    public void check_mnom_is_not_abba() {
        var sequence = "mnom";

        assertThat(IPV7Parser.isAbba(sequence)).isFalse();
    }

    @Test
    public void check_aaaa_is_not_abba() {
        var sequence = "aaaa";

        assertThat(IPV7Parser.isAbba(sequence)).isFalse();
    }

    @Test
    public void check_abba_contains_abba() {
        var sequence = "abba";

        assertThat(IPV7Parser.containsAbba(sequence)).isTrue();
    }

    @Test
    public void check_ioxxoj_contains_abba() {
        var sequence = "ioxxoj";

        assertThat(IPV7Parser.containsAbba(sequence)).isTrue();
    }

    @Test
    public void parses_sequences() {
        var input = "asdf[yxcv]qwert[vbnm]poiu";

        var address = fromString(input);

        assertThat(address).isNotNull();
        assertThat(address.getNormalSequences()).containsExactly("asdf", "qwert", "poiu");
        assertThat(address.getHypernetSequences()).containsExactly("yxcv", "vbnm");
    }
}