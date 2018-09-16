package com.mindhaq.adventofcode2016.day08;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScreenTest {

    private final Screen screen = new Screen(4, 3);

    @Test
    public void screen_starts_blank() {
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 3; y++) {
                assertThat(screen.get(x, y)).isFalse();
            }
        }
    }

    @Test
    public void sets_and_gets_pixel() {
        // given
        screen.set(1, 1, true);

        // when
        boolean pixel = screen.get(1, 1);

        // then
        assertThat(pixel).isTrue();
    }

    @Test
    public void gets_row() {
        // given
        screen.set(1, 1, true);

        // when
        boolean[] row = screen.getRow(1);

        // then
        assertThat(row).containsExactly(false, true, false, false);
    }
}
