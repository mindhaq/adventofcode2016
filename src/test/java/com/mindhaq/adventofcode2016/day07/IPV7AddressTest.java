package com.mindhaq.adventofcode2016.day07;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class IPV7AddressTest {

    @Test
    public void example1() {
        var ipv7 = IPV7Parser.fromString("abba[mnop]qrst");

        assertThat(ipv7.supportsTLS()).isTrue();
    }

    @Test
    public void example2() {
        var ipv7 = IPV7Parser.fromString("abcd[bddb]xyyx");

        assertThat(ipv7.supportsTLS()).isFalse();
    }

    @Test
    public void example3() {
        var ipv7 = IPV7Parser.fromString("aaaa[qwer]tyui");

        assertThat(ipv7.supportsTLS()).isFalse();
    }

    @Test
    public void example4() {
        var ipv7 = IPV7Parser.fromString("ioxxoj[asdfgh]zxcvbn");

        assertThat(ipv7.supportsTLS()).isTrue();
    }


}
