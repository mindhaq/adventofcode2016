package com.mindhaq.adventofcode2016.day08;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScreenTest {

    private final Screen screen = new Screen();

    @Test
    public void sets_and_gets_pixel() {
        assertThat(screen.get(1, 1)).isFalse();

        screen.set(1, 1, true);

        assertThat(screen.get(1, 1)).isTrue();
    }

}
