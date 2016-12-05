package com.mindhaq.adventofcode2016.day02;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class Keypad {
	private final int size;

	private int posX = 0;

	private int posY = 0;

	public Keypad() {
		this.size = 3;
	}

	public void setPosition(int posX, int posY) {
		checkArgument(posX >= 0 && posX < size);
		checkArgument(posY >= 0 && posY < size);

		this.posX = posX;
		this.posY = posY;
	}
}