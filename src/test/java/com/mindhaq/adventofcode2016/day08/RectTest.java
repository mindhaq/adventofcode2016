package com.mindhaq.adventofcode2016.day08;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RectTest {

    @Test
    public void paints_rectangle() {
        // given
        var screen = new Screen(4, 3);
        var operation = new Rect(2, 2);

        // when
        operation.execute(screen);

        // then
        assertThat(screen.countLit()).isEqualTo(4);
    }
}
