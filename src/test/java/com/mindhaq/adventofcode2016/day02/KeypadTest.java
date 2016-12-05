package com.mindhaq.adventofcode2016.day02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class KeypadTest {

	private final Keypad keypad = new Keypad(3);

	@Test(expected = IllegalArgumentException.class)
	public void dont_allow_negative_posX() {
		keypad.setPosition(-1, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void dont_allow_negative_posY() {
		keypad.setPosition(0, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void dont_allow_too_large_posX() {
		keypad.setPosition(3, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void dont_allow_too_large_posY() {
		keypad.setPosition(0, 3);
	}
}
