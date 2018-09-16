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

    @Test
    public void sets_row() {
        // given
        var row = new boolean[]{true, false, false, true};

        // when
        screen.setRow(1, row);

        // then
        assertThat(screen.get(0, 1)).isTrue();
    }

    @Test
    public void gets_column() {
        // given
        screen.set(1, 1, true);

        // when
        boolean[] col = screen.getCol(1);

        // then
        assertThat(col).containsExactly(false, true, false);
    }
}
