package com.mindhaq.adventofcode2016.day01;

import org.junit.Test;

import static com.mindhaq.adventofcode2016.day01.Vector2DMatchers.hasX;
import static com.mindhaq.adventofcode2016.day01.Vector2DMatchers.hasY;
import static com.mindhaq.adventofcode2016.day01.Vector2DMatchers.isVectorAt;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TaxiCabWalkerTest {

	private final TaxiCabWalker walker = new TaxiCabWalker();

	@Test
	public void example1() {
		walker.walk("R2");
		walker.walk("L3");

		assertThat(walker.getDistance(), is(5));
	}

	@Test
	public void example2() {
		walker.walk("R2");
		walker.walk("R2");
		walker.walk("R2");

		assertThat(walker.getDistance(), is(2));
	}

	@Test
	public void example3() {
		walker.walk("R5");
		walker.walk("L5");
		walker.walk("R5");
		walker.walk("R3");

		assertThat(walker.getDistance(), is(12));
	}

	@Test
	public void example4() {
		walker.walk("R8");
		walker.walk("R4");
		walker.walk("R4");
		walker.walk("R8");

		assertThat(walker.getFirstPositionVisitedTwice(), isVectorAt(4, 0));
	}
}
