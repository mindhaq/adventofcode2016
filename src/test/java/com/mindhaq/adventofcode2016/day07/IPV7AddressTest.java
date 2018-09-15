package com.mindhaq.adventofcode2016.day07;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class IPV7AddressTest {

    @Test
    public void part1_example1() {
        var ipv7 = IPV7Parser.fromString("abba[mnop]qrst");

        assertThat(ipv7.supportsTLS()).isTrue();
    }

    @Test
    public void part1_example2() {
        var ipv7 = IPV7Parser.fromString("abcd[bddb]xyyx");

        assertThat(ipv7.supportsTLS()).isFalse();
    }

    @Test
    public void part1_example3() {
        var ipv7 = IPV7Parser.fromString("aaaa[qwer]tyui");

        assertThat(ipv7.supportsTLS()).isFalse();
    }

    @Test
    public void part1_example4() {
        var ipv7 = IPV7Parser.fromString("ioxxoj[asdfgh]zxcvbn");

        assertThat(ipv7.supportsTLS()).isTrue();
    }

    @Test
    public void part2_example1() {
        var ipv7 = IPV7Parser.fromString("aba[bab]xyz");

        assertThat(ipv7.supportsSSL()).isTrue();
    }

    @Test
    public void part2_example2() {
        var ipv7 = IPV7Parser.fromString("xyx[xyx]xyx");

        assertThat(ipv7.supportsSSL()).isFalse();
    }

    @Test
    public void part2_example3() {
        var ipv7 = IPV7Parser.fromString("aaa[kek]eke");

        assertThat(ipv7.supportsSSL()).isTrue();
    }

    @Test
    public void part2_example4() {
        var ipv7 = IPV7Parser.fromString("zazbz[bzb]cdb");

        assertThat(ipv7.supportsSSL()).isTrue();
    }
}
