package com.mindhaq.adventofcode2016.day02;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiamondShapedKeypadTest {

	private final static DiamondShapedKeypad keypad = new DiamondShapedKeypad();

	@Test
	public void example1_uul_is_five() {
		keypad.moveUp();
		keypad.moveLeft();
		keypad.moveLeft();

		assertThat(keypad.getSelectedKey(), is("5"));
	}

	@Test
	public void example2_rrddd_from_one_is_D() {
		keypad.moveRight();
		keypad.moveRight();
		keypad.moveDown();
		keypad.moveDown();
		keypad.moveDown();
		keypad.moveDown();

		assertThat(keypad.getSelectedKey(), is("D"));
	}

	@Test
	public void example3_lurdl_from_nine_is_B() {
		keypad.moveLeft();
		keypad.moveUp();
		keypad.moveRight();
		keypad.moveDown();
		keypad.moveLeft();

		assertThat(keypad.getSelectedKey(), is("B"));
	}

	@Test
	public void example4_uuuud_from_eight_is_three() {
		keypad.moveUp();
		keypad.moveUp();
		keypad.moveUp();
		keypad.moveUp();
		keypad.moveDown();

		assertThat(keypad.getSelectedKey(), is("3"));
	}

}
