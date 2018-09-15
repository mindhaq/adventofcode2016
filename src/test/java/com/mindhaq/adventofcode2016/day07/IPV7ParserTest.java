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
        assertThat(address.getSupernetSequences()).containsExactly("asdf", "qwert", "poiu");
        assertThat(address.getHypernetSequences()).containsExactly("yxcv", "vbnm");
    }

    @Test
    public void check_aba_is_aba() {
        var sequence = "aba";

        assertThat(IPV7Parser.isAba(sequence)).isTrue();
    }

    @Test
    public void check_aaa_is_no_aba() {
        var sequence = "aaa";

        assertThat(IPV7Parser.isAba(sequence)).isFalse();
    }

    @Test
    public void check_yxy_is_bab_of_xyx() {
        var sequence = "yxy";
        var aba = "xyx";

        assertThat(IPV7Parser.isBabOf(sequence, aba)).isTrue();
    }

    @Test
    public void check_xyx_is_not_bab_of_xyx() {
        var sequence = "xyx";
        var aba = "xyx";

        assertThat(IPV7Parser.isBabOf(sequence, aba)).isFalse();
    }

    @Test
    public void converts_aba_to_bab() {
        var aba = "xyx";

        var bab = IPV7Parser.toBab(aba);

        assertThat(bab).isEqualTo("yxy");
    }

    @Test
    public void finds_abas() {
        var sequence = "zazbz";

        assertThat(IPV7Parser.findAbas(sequence)).containsExactly("zaz", "zbz");
    }
}
