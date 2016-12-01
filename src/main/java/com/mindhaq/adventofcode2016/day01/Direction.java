package com.mindhaq.adventofcode2016.day01;

import java.util.Optional;
import java.util.stream.Stream;

public enum Direction {
	North(0), East(90), South(180), West(270);

	public final int degrees;

	Direction(int degrees) {
		this.degrees = degrees;
	}

	public Direction rotate(final int rotation) {
		int actualRotation = rotation % 360;
		int newDegrees = this.degrees + actualRotation;

		if (newDegrees < 0) {
			newDegrees = 360 + newDegrees;
		}

		if (newDegrees == 360) {
			newDegrees = 0;
		}

		return from(newDegrees);
	}

	public Direction left() {
		return rotate(-90);
	}

	public Direction right() {
		return rotate(90);
	}

	public static Direction from(int degrees) {
		Optional<Direction> directionOptional = Stream.of(Direction.values())
				.filter(d -> d.degrees == degrees)
				.findFirst();

		if (directionOptional.isPresent()) {
			return directionOptional.get();
		}

		throw new IllegalArgumentException("No direction at " + degrees + " degrees.");
	}
}
