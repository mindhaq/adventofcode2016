package com.mindhaq.adventofcode2016.day05;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class HashTest {

    @Test
    public void interesting_string_example1() {
        // given
        String s = "abc3231929";

        // when
        Hash hash = new Hash(s);

        // then
        assertThat(hash.isInteresting()).isTrue();
        assertThat(hash.getToken()).isEqualTo("1");
    }

    @Test
    public void interesting_string_example2() {
        // given
        String s = "abc5017308";

        // when
        Hash hash = new Hash(s);

        // then
        assertThat(hash.isInteresting()).isTrue();
        assertThat(hash.getToken()).isEqualTo("8");
    }

    @Test
    public void interesting_string_example3() {
        // given
        String s = "abc5278568";

        // when
        Hash hash = new Hash(s);

        // then
        assertThat(hash.isInteresting()).isTrue();
        assertThat(hash.getToken()).isEqualTo("f");
    }

    // part 2

    @Test
    public void interesting_string_part2_example1() {
        // given
        String s = "abc3231929";

        // when
        Hash hash = new Hash(s);

        // then
        assertThat(hash.isInterestingPosition()).isTrue();
        assertThat(hash.getPosition()).isEqualTo(1);
        assertThat(hash.getTokenAtPosition()).isEqualTo("5");
    }

    @Test
    public void interesting_string_part2_example2() {
        // given
        String s = "abc5017308";

        // when
        Hash hash = new Hash(s);

        // then
        assertThat(hash.isInterestingPosition()).isFalse();
    }

    @Test
    public void interesting_string_part2_example3() {
        // given
        String s = "abc5357525";

        // when
        Hash hash = new Hash(s);

        // then
        assertThat(hash.isInterestingPosition()).isTrue();
        assertThat(hash.getPosition()).isEqualTo(4);
        assertThat(hash.getTokenAtPosition()).isEqualTo("e");
    }

}
