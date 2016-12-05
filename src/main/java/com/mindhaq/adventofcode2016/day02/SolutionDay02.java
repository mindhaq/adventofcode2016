package com.mindhaq.adventofcode2016.day02;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.List;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.io.Resources.getResource;
import static com.google.common.io.Resources.readLines;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class SolutionDay02 {

	public static void main(String[] args) throws IOException {
		final Logger logger = getLogger(SolutionDay02.class);

		Keypad squareShapedKeypad = new SquareShapedKeypad();
		Operator operator = new Operator(squareShapedKeypad);

		List<String> input = readLines(getResource(SolutionDay02.class, "input.txt"), UTF_8);
		for (String line: input) {
			operator.follow(line);
		}

		logger.info("Bathroom code is {}.", operator.getCombination());
	}
}
