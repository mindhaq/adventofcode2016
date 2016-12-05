package com.mindhaq.adventofcode2016.day02;


import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class OperatorTest {

	private final Keypad keypad = mock(Keypad.class);

	private final Operator operator = new Operator(keypad);

	@Test
	public void parses_instructions_and_commands_keypad() {
		operator.follow("UDRLL");

		verify(keypad, times(1)).moveUp();
		verify(keypad, times(1)).moveDown();
		verify(keypad, times(1)).moveRight();
		verify(keypad, times(2)).moveLeft();
	}
}
