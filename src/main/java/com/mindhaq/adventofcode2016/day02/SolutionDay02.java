package com.mindhaq.adventofcode2016.day02;

import org.slf4j.Logger;

import java.io.IOException;
import java.util.List;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.io.Resources.getResource;
import static com.google.common.io.Resources.readLines;
import static java.util.stream.Collectors.joining;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class SolutionDay02 {

	public static void main(String[] args) throws IOException {
		final Logger logger = getLogger(SolutionDay02.class);

		List<String> input = readLines(getResource(SolutionDay02.class, "input.txt"), UTF_8);

		Operator operator = new Operator(new SquareShapedKeypad());
		String combination = findCombination(input, operator);

		logger.info("Bathroom code is {}.", combination);
	}

	private static String findCombination(List<String> input, Operator operator) {
		return input.stream()
					.map(s -> operator.follow(s))
					.collect(joining());
	}
}
