package com.mindhaq.adventofcode2016.day03;

import org.slf4j.Logger;

import java.io.IOException;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.io.Resources.getResource;
import static com.google.common.io.Resources.readLines;
import static java.util.Arrays.stream;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class SolutionDay03 {
	final static Pattern LINE_SPLITTER_PATTERN = Pattern.compile("\\s+(\\d{1,3})\\s+(\\d{1,3})\\s+(\\d{1,3})");

	public static void main(String[] args) throws IOException {
		final Logger logger = getLogger(SolutionDay03.class);
		logger.debug("finding triangles.");

		long numberOfTriangles =
				readLines(getResource(SolutionDay03.class, "input.txt"), UTF_8)
				.parallelStream()
				.map(SolutionDay03::parseLine)
				.map(SolutionDay03::stringsToInts)
				.filter(SolutionDay03::isTriangle)
				.count();

		logger.info("There are {} valid triangles.", numberOfTriangles);
	}

	static int[] stringsToInts(String[] args) {
		return stream(args)
				.mapToInt(Integer::valueOf)
				.sorted()
				.toArray();
	}

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

	static boolean isTriangle(int... s) {
		checkArgument(s[0] <= s[1], "s1 must be small than s2.");
		checkArgument(s[1] <= s[2], "s2 must be small than s3.");

		return s[0] + s[1] > s[2];
	}
}
