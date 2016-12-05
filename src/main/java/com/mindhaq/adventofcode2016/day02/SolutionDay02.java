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

		String combination1 = findCombination(input, new SquareShapedKeypad());
		logger.info("Bathroom code is {}.", combination1);

		String combination2 = findCombination(input, new DiamondShapedKeypad());
		logger.info("New Bathroom code is {}.", combination2);
	}

	private static String findCombination(List<String> input, Keypad keypad) {
		Operator operator = new Operator(keypad);

		return input.stream()
					.map(s -> operator.follow(s))
					.collect(joining());
	}
}
