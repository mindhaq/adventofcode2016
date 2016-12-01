package com.mindhaq.adventofcode2016.day01;

import org.junit.Test;

import static com.mindhaq.adventofcode2016.day01.Vector2DMatchers.hasX;
import static com.mindhaq.adventofcode2016.day01.Vector2DMatchers.hasY;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class Vector2DTest {

	@Test
	public void basic_addition_works() {
		// given
		Vector2D v1 = new Vector2D(1, 1);
		Vector2D v2 = new Vector2D(1, 2);

		// when
		Vector2D sum = v1.add(v2);

		// then
		assertThat(sum, allOf(
				hasX(equalTo(2)),
				hasY(equalTo(3))
		));
	}

	@Test
	public void taxicabdistance_with_negative_x_has_positive_value() {
		Vector2D vector2D = new Vector2D(-10, 5);

		assertThat(vector2D.getTaxiCabDistance(), is(15));
	}

	@Test
	public void taxicabdistance_with_negative_y_has_positive_value() {
		Vector2D vector2D = new Vector2D(10, -5);

		assertThat(vector2D.getTaxiCabDistance(), is(15));
	}

}
