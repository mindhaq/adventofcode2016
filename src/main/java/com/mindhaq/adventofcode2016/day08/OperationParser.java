package com.mindhaq.adventofcode2016.day08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperationParser {

    private final static Pattern PARSE_REC = Pattern.compile("rect (\\d+)x(\\d+)");

    public static Operation parse(String commandText) {
        Matcher matcher;

        matcher = PARSE_REC.matcher(commandText);
        if (matcher.matches()) {
            var width = Integer.parseInt(matcher.group(1));
            var height = Integer.parseInt(matcher.group(2));

            return new Rect(width, height);
        }

        throw new IllegalArgumentException("cannot parse '" + commandText + "'");
    }
}
