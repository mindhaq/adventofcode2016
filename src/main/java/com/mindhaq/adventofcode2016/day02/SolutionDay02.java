package com.mindhaq.adventofcode2016.day02;

import org.slf4j.Logger;

import java.util.List;

import static com.mindhaq.adventofcode2016.Utils.readInput;
import static java.util.stream.Collectors.joining;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class SolutionDay02 {

    public static void main(String[] args) {
		final Logger logger = getLogger(SolutionDay02.class);

        List<String> input = readInput(SolutionDay02.class);

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
