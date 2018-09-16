package com.mindhaq.adventofcode2016.day08;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OperationParserTest {

    @Test(expected = IllegalArgumentException.class)
    public void throws_for_unparsable_text() {
        OperationParser.parse("gibberish");
    }

    @Test
    public void parses_rect_operation() {
        // given
        var command = "rect 3x2";

        // when
        Operation operation = OperationParser.parse(command);

        // then
        assertThat(operation).isNotNull();

        var rect = (Rect) operation;
        assertThat(rect.getWidth()).isEqualTo(3);
        assertThat(rect.getHeight()).isEqualTo(2);
    }
}
