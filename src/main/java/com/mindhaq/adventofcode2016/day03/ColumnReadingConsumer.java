package com.mindhaq.adventofcode2016.day03;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import static com.google.common.collect.Lists.newArrayList;
import static com.mindhaq.adventofcode2016.day03.SolutionDay03.parseLine;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class ColumnReadingConsumer implements Consumer<String> {

	private int i = 0;

	private String[][] numbers = new String[3][3];

	private List<String[]> triangleSides = newArrayList();

	@Override
	public void accept(String line) {
		String[] l = parseLine(line);
		numbers[0][i] = l[0];
		numbers[1][i] = l[1];
		numbers[2][i] = l[2];
		if (++i == 3) {
			i = 0;
			triangleSides.addAll(Arrays.asList(numbers));
			numbers = new String[3][3];
		}
	}

	public Collection<String[]> getTriangleSides() {
		return triangleSides;
	}
}
