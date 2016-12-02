package com.mindhaq.adventofcode2016.day01;

import static com.mindhaq.adventofcode2016.day01.Direction.North;

public class TaxiCabWalker {

	private final DirectionVectorizer vectorizer = new DirectionVectorizer();

	private Direction direction = North;

	private Vector2D position = vectorizer.vectorize(direction, 0);

	public void walk(String instruction) {
		char rotation = instruction.charAt(0);
		int distance = Integer.valueOf(instruction.substring(1));

		rotate(rotation);
		move(distance);
	}

	private void rotate(char rotation) {
		switch (rotation) {
			case 'R':
				direction = direction.right();
				break;

			case 'L':
				direction = direction.left();
				break;

			default:
				throw new IllegalArgumentException("wrong rotation " + rotation + " in instruction.");
		}
	}

	private void move(int distance) {
		Vector2D step = vectorizer.vectorize(direction, distance);
		position = position.add(step);
	}

	public int getDistance() {
		return position.getTaxiCabDistance();
	}
}
