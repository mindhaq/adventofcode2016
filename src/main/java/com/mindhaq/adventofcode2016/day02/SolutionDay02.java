package com.mindhaq.adventofcode2016.day02;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class SolutionDay02 {


	public static void main(String[] args) throws IOException {
		final Logger logger = getLogger(SolutionDay02.class);

		Keypad keypad = new Keypad();
		StringBuilder sb = new StringBuilder();
		List<String> input = Resources.readLines(Resources.getResource(SolutionDay02.class, "input.txt"), Charsets.UTF_8);
		for (String line: input) {
			for (int i = 0; i < line.length(); i++) {
				char command = line.charAt(i);
				switch (command) {
					case 'L':
						keypad.moveLeft();
						break;

					case 'U':
						keypad.moveUp();
						break;

					case 'R':
						keypad.moveRight();
						break;

					case 'D':
						keypad.moveDown();
						break;
				}
			}

			sb.append(keypad.getNumber());
		}

		logger.info("Bathroom code is {}.", sb.toString());
	}
}
