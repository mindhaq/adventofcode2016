package com.mindhaq.adventofcode2016.day02;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class Operator {
	private final StringBuilder combination = new StringBuilder();

	private final Keypad keypad;

	public Operator(Keypad keypad) {
		this.keypad = keypad;
	}

	public void follow(String instructions) {
		for (int i = 0; i < instructions.length(); i++) {
			char command = instructions.charAt(i);
			switch (command) {
				case 'L':
					keypad.moveLeft();
					break;

				case 'U':
					keypad.moveUp();
					break;

				case 'R':
					keypad.moveRight();
					break;

				case 'D':
					keypad.moveDown();
					break;

				default:
					throw new IllegalArgumentException("Instructions contain illegal character " + command);
			}
		}

		combination.append(keypad.getNumber());
	}

	public String getCombination() {
		return combination.toString();
	}
}
