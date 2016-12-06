package com.mindhaq.adventofcode2016.day03;


import org.junit.Test;

import static com.mindhaq.adventofcode2016.day03.SolutionDay03.isTriangle;
import static com.mindhaq.adventofcode2016.day03.SolutionDay03.parseLine;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class SolutionDay03Test {

	@Test
	public void pattern_splits_into_trimmed_array_of_three() {
		// given
		String line = "    2   84  335";

		// when
		String[] strings = parseLine(line);

		// then
		assertThat(strings.length, is(3));
		assertThat(strings[0], is("2"));
		assertThat(strings[1], is("84"));
		assertThat(strings[2], is("335"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void triangle_filter_requires_sorted_parameters() {
		isTriangle(25, 5, 10);
	}
}
