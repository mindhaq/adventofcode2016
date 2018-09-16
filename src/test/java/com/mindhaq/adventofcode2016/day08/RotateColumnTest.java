package com.mindhaq.adventofcode2016.day08;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateColumnTest {

    @Test
    public void rotates_first_column() {
        // given
        var screen = new Screen(4, 3);
        screen.set(0, 1, true);
        screen.set(0, 2, true);
        var operation = new RotateColumn(0, 2);

        // when
        operation.execute(screen);

        // then
        assertThat(screen.get(0, 0)).isTrue();
        assertThat(screen.get(0, 1)).isTrue();
        assertThat(screen.get(0, 2)).isFalse();
    }
}
