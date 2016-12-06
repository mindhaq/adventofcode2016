package com.mindhaq.adventofcode2016.day03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class SolutionDay03 {
	final static Pattern LINE_SPLITTER_PATTERN = Pattern.compile("\\s+(\\d{1,3})\\s+(\\d{1,3})\\s+(\\d{1,3})");

	static String[] parseLine(String line) {
		Matcher matcher = LINE_SPLITTER_PATTERN.matcher(line);
		if (!matcher.find()) {
			throw new IllegalArgumentException("unparseable line: " + line);
		}

		return new String[] {
				matcher.group(1),
				matcher.group(2),
				matcher.group(3)
		};
	}
}
