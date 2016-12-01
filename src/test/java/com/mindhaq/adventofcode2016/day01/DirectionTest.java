package com.mindhaq.adventofcode2016.day01;

import org.junit.Test;

import static com.mindhaq.adventofcode2016.day01.Direction.East;
import static com.mindhaq.adventofcode2016.day01.Direction.North;
import static com.mindhaq.adventofcode2016.day01.Direction.South;
import static com.mindhaq.adventofcode2016.day01.Direction.West;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class DirectionTest {

	@Test
	public void ninety_degree_is_east() {
		assertThat(Direction.from(90), is(East));
	}

	@Test
	public void north_rotated_90_is_east() {
		assertThat(North.rotate(90), is(East));
	}

	@Test
	public void west_rotated_360_is_west() {
		assertThat(West.rotate(360), is(West));
	}

	@Test
	public void right_of_south_is_west() {
		assertThat(South.right(), is(West));
	}

	@Test
	public void left_of_east_is_north() {
		assertThat(East.left(), is(North));
	}

	@Test
	public void left_of_north_is_west() {
		assertThat(North.left(), is(West));
	}

	@Test
	public void right_of_west_is_north() {
		assertThat(West.right(), is(North));
	}
}
