package com.mindhaq.adventofcode2016.day08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperationParser {

    private final static Pattern PARSE_REC = Pattern.compile("rect (\\d+)x(\\d+)");
    private final static Pattern PARSE_ROTATE_COLUMN = Pattern.compile("rotate column x=(\\d+) by (\\d+)");
    private final static Pattern PARSE_ROTATE_ROW = Pattern.compile("rotate row y=(\\d+) by (\\d+)");

    public static Operation parse(String commandText) {
        Matcher matcher;

        matcher = PARSE_REC.matcher(commandText);
        if (matcher.matches()) {
            var width = Integer.parseInt(matcher.group(1));
            var height = Integer.parseInt(matcher.group(2));

            return new Rect(width, height);
        }

        matcher = PARSE_ROTATE_COLUMN.matcher(commandText);
        if (matcher.matches()) {
            var x = Integer.parseInt(matcher.group(1));
            var pixels = Integer.parseInt(matcher.group(2));

            return new RotateColumn(x, pixels);
        }

        matcher = PARSE_ROTATE_ROW.matcher(commandText);
        if (matcher.matches()) {
            var y = Integer.parseInt(matcher.group(1));
            var pixels = Integer.parseInt(matcher.group(2));

            return new RotateRow(y, pixels);
        }

        throw new IllegalArgumentException("cannot parse '" + commandText + "'");
    }
}
