package com.mindhaq.adventofcode2016.day02;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class SquareShapedKeypad implements Keypad {
	private final int size;

	private int posX = 1;

	private int posY = 1;

	public SquareShapedKeypad() {
		this.size = 3;
	}

	public void setPosition(int posX, int posY) {
		checkArgument(posX >= 0 && posX < size, "Illegal value for posX: " + posX);
		checkArgument(posY >= 0 && posY < size, "Illegal value for posY: " + posY);

		this.posX = posX;
		this.posY = posY;
	}

	private void move(int x, int y) {
		setPosition(constrain(posX + x), constrain(posY + y));
	}

	private int constrain(int i) {
		if (i < 0) {
			return 0;
		}

		if (i >= size) {
			return size - 1;
		}

		return i;
	}

	@Override
	public String getSelectedKey() {
		return Integer.toString((posX + 1) + (posY * size));
	}

	@Override
	public void moveLeft() {
		move(-1, 0);
	}

	@Override
	public void moveRight() {
		move(1, 0);
	}

	@Override
	public void moveUp() {
		move(0, -1);
	}

	@Override
	public void moveDown() {
		move(0, 1);
	}
}
