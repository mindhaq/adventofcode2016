package com.mindhaq.adventofcode2016.day01;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class Vector2DTest {

	@Test
	public void basic_addition_works() {
		// given
		Vector2D v1 = new Vector2D(1, 1);
		Vector2D v2 = new Vector2D(1, 2);

		// when
		Vector2D sum = v1.add(v2);

		// then
		assertThat(sum.x, is(2));
		assertThat(sum.y, is(3));
	}


}
