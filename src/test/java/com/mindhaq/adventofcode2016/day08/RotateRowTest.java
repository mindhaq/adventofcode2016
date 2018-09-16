package com.mindhaq.adventofcode2016.day08;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateRowTest {

    @Test
    public void rotates_first_row() {
        // given
        var screen = new Screen(4, 3);
        screen.set(0, 0, true);
        screen.set(1, 0, true);
        var operation = new RotateRow(0, 2);

        // when
        operation.execute(screen);

        // then
        assertThat(screen.get(0, 0)).isFalse();
        assertThat(screen.get(1, 0)).isFalse();
        assertThat(screen.get(2, 0)).isTrue();
        assertThat(screen.get(3, 0)).isTrue();
    }
}
