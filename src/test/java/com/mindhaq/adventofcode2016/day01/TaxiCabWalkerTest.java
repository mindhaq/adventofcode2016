package com.mindhaq.adventofcode2016.day01;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

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
}
