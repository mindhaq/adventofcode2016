package com.mindhaq.adventofcode2016.day01;

import org.junit.Test;

import static com.mindhaq.adventofcode2016.day01.Vector2DMatchers.hasX;
import static com.mindhaq.adventofcode2016.day01.Vector2DMatchers.hasY;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DirectionVectorizerTest {

	private final DirectionVectorizer directionVectorizer = new DirectionVectorizer();

	@Test
	public void five_north_is_0_5() {
		Vector2D vector2D = directionVectorizer.vectorize(Direction.North, 5);

		assertThat(vector2D, allOf(
				hasX(equalTo(0)),
				hasY(equalTo(5))
		));
	}

	@Test
	public void three_east_is_3_0() {
		Vector2D vector2D = directionVectorizer.vectorize(Direction.East, 3);

		assertThat(vector2D, allOf(
				hasX(equalTo(3)),
				hasY(equalTo(0))
		));
	}

	@Test
	public void six_south_is_0_m6() {
		Vector2D vector2D = directionVectorizer.vectorize(Direction.South, 6);

		assertThat(vector2D, allOf(
				hasX(equalTo(0)),
				hasY(equalTo(-6))
		));
	}

	@Test
	public void two_west_is_m2_0() {
		Vector2D vector2D = directionVectorizer.vectorize(Direction.West, 2);

		assertThat(vector2D, allOf(
				hasX(equalTo(-2)),
				hasY(equalTo(0))
		));
	}
}
