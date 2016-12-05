package com.mindhaq.adventofcode2016.day02;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class KeypadTest {

	private final Keypad keypad = new Keypad();

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

	@Test
	public void initial_number_is_five() {
		assertThat(keypad.getNumber(), is(5));
	}

	@Test
	public void moving_left_sets_number_to_four() {
		keypad.moveLeft();

		assertThat(keypad.getNumber(), is(4));
	}

	@Test
	public void moving_right_sets_number_to_six() {
		keypad.moveRight();

		assertThat(keypad.getNumber(), is(6));
	}
}
