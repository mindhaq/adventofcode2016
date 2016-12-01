package com.mindhaq.adventofcode2016.day01;

public class DirectionVectorizer {
	public Vector2D vectorize(Direction direction, int distance) {
		switch (direction) {
			case North:
				return new Vector2D(0, distance);

			case East:
				return new Vector2D(distance, 0);

			case South:
				return new Vector2D(0, -distance);

			case West:
				return new Vector2D(-distance, 0);
		}

		throw new IllegalArgumentException("Unknown direction " + direction);
	}
}
