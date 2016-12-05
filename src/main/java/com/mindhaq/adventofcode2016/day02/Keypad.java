package com.mindhaq.adventofcode2016.day02;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public interface Keypad {
	int getNumber();

	void moveLeft();

	void moveRight();

	void moveUp();

	void moveDown();
}
