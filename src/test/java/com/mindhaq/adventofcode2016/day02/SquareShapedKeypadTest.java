package com.mindhaq.adventofcode2016.day02;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class SquareShapedKeypadTest {

	private final SquareShapedKeypad squareShapedKeypad = new SquareShapedKeypad();

	@Test(expected = IllegalArgumentException.class)
	public void dont_allow_negative_posX() {
		squareShapedKeypad.setPosition(-1, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void dont_allow_negative_posY() {
		squareShapedKeypad.setPosition(0, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void dont_allow_too_large_posX() {
		squareShapedKeypad.setPosition(3, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void dont_allow_too_large_posY() {
		squareShapedKeypad.setPosition(0, 3);
	}

	@Test
	public void initial_number_is_five() {
		assertThat(squareShapedKeypad.getSelectedKey(), is("5"));
	}

	@Test
	public void moving_left_sets_number_to_four() {
		squareShapedKeypad.moveLeft();

		assertThat(squareShapedKeypad.getSelectedKey(), is("4"));
	}

	@Test
	public void moving_right_sets_number_to_six() {
		squareShapedKeypad.moveRight();

		assertThat(squareShapedKeypad.getSelectedKey(), is("6"));
	}

	@Test
	public void moving_up_sets_number_to_two() {
		squareShapedKeypad.moveUp();

		assertThat(squareShapedKeypad.getSelectedKey(), is("2"));
	}

	@Test
	public void moving_down_sets_number_to_eight() {
		squareShapedKeypad.moveDown();

		assertThat(squareShapedKeypad.getSelectedKey(), is("8"));
	}

	@Test
	public void uul_is_one() {
		squareShapedKeypad.moveUp();
		squareShapedKeypad.moveLeft();
		squareShapedKeypad.moveLeft();

		assertThat(squareShapedKeypad.getSelectedKey(), is("1"));
	}

	@Test
	public void rrddd_from_one_is_nine() {
		squareShapedKeypad.setPosition(0, 0);

		squareShapedKeypad.moveRight();
		squareShapedKeypad.moveRight();
		squareShapedKeypad.moveDown();
		squareShapedKeypad.moveDown();
		squareShapedKeypad.moveDown();
		squareShapedKeypad.moveDown();

		assertThat(squareShapedKeypad.getSelectedKey(), is("9"));
	}

	@Test
	public void lurdl_from_nine_is_eight() {
		squareShapedKeypad.setPosition(2, 2);

		squareShapedKeypad.moveLeft();
		squareShapedKeypad.moveUp();
		squareShapedKeypad.moveRight();
		squareShapedKeypad.moveDown();
		squareShapedKeypad.moveLeft();

		assertThat(squareShapedKeypad.getSelectedKey(), is("8"));
	}

	@Test
	public void uuuud_from_eight_is_five() {
		squareShapedKeypad.setPosition(1, 2);

		squareShapedKeypad.moveUp();
		squareShapedKeypad.moveUp();
		squareShapedKeypad.moveUp();
		squareShapedKeypad.moveUp();
		squareShapedKeypad.moveDown();

		assertThat(squareShapedKeypad.getSelectedKey(), is("5"));
	}
}
