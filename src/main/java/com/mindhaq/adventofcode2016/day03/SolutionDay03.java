package com.mindhaq.adventofcode2016.day03;

import org.slf4j.Logger;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.google.common.base.Preconditions.checkArgument;
import static com.mindhaq.adventofcode2016.Utils.readInput;
import static java.util.Arrays.stream;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class SolutionDay03 {
    private final static Pattern LINE_SPLITTER_PATTERN = Pattern.compile("\\s+(\\d{1,3})\\s+(\\d{1,3})\\s+(\\d{1,3})");
    private final static Logger LOG = getLogger(SolutionDay03.class);

    public static void main(String[] args) {
        LOG.debug("finding triangles.");

        final List<String> readLines = readInput(SolutionDay03.class);

        countTrianglesPart1(readLines);
        countTrianglesPart2(readLines);
    }

    private static void countTrianglesPart1(List<String> readLines) {
        long numberOfTrianglesPart1 = readLines
            .parallelStream()
            .map(SolutionDay03::parseLine)
            .map(SolutionDay03::stringsToInts)
            .filter(SolutionDay03::isTriangle)
            .count();

        LOG.info("Part1: there are {} valid triangles.", numberOfTrianglesPart1);
    }

    private static void countTrianglesPart2(List<String> readLines) {
        ColumnReadingConsumer columnReadingConsumer = new ColumnReadingConsumer();
        readLines.forEach(columnReadingConsumer);

        long numberOfTrianglesPart2 = columnReadingConsumer
            .getTriangleSides()
            .parallelStream()
            .map(SolutionDay03::stringsToInts)
            .filter(SolutionDay03::isTriangle)
            .count();

        LOG.info("Part2: there are {} valid triangles.", numberOfTrianglesPart2);
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

        return new String[]{
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
