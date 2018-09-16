package com.mindhaq.adventofcode2016.day08;

import org.junit.Test;

public class OperationParserTest {

    @Test(expected = IllegalArgumentException.class)
    public void throws_for_unparsable_text() {
        OperationParser.parse("gibberish");
    }
}
