package com.mindhaq.adventofcode2016.day01;

import com.google.common.collect.Sets;
import org.slf4j.Logger;

import java.util.Set;

import static com.google.common.collect.Sets.newHashSet;
import static com.mindhaq.adventofcode2016.day01.Direction.North;
import static org.slf4j.LoggerFactory.getLogger;

public class TaxiCabWalker {
	
	private final Logger logger = getLogger(TaxiCabWalker.class);

	private final DirectionVectorizer vectorizer = new DirectionVectorizer();

	private final Set<Vector2D> visitedPositions = newHashSet();

	private Vector2D firstPositionVisitedTwice;

	private Direction direction = North;

	private Vector2D position = new Vector2D(0,0);

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

		logger.debug("Rotated to {}", direction);
	}

	private void move(int distance) {
		for (int i = 1; i <= distance; i++) {
			Vector2D step = vectorizer.vectorize(direction, 1);
			position = position.add(step);
			rememberPosition();
		}
	}

	private void rememberPosition() {
		logger.debug("Walking to {}", position);

		if (!visitedPositions.add(position) && firstPositionVisitedTwice == null) {
			firstPositionVisitedTwice = position;
		}
	}

	public int getDistance() {
		return position.getTaxiCabDistance();
	}

	public Vector2D getFirstPositionVisitedTwice() {
		return firstPositionVisitedTwice;
	}

	public int getDistanceOfFirstPositionVisitedTwice() {
		return firstPositionVisitedTwice.getTaxiCabDistance();
	}
}
