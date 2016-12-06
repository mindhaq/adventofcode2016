package com.mindhaq.adventofcode2016.day03;


import com.google.common.collect.Lists;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.is;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class ColumnReadingConsumerTest {

	private final ColumnReadingConsumer columnReadingConsumer = new ColumnReadingConsumer();

	@Test
	public void sorts_numbers_by_columns() {
		// given
		List<String> input = newArrayList(" 101 301 501 ", " 102 302 502 ", " 103 303 503 ");

		// when
		input.forEach(columnReadingConsumer);
		Collection<String[]> triangleSides = columnReadingConsumer.getTriangleSides();

		// then
		assertThat(triangleSides.size(), is(3));

		Iterator<String[]> iterator = triangleSides.iterator();
		assertThat(iterator.next(), arrayContaining("101", "102", "103"));
		assertThat(iterator.next(), arrayContaining("301", "302", "303"));
		assertThat(iterator.next(), arrayContaining("501", "502", "503"));
	}
}
