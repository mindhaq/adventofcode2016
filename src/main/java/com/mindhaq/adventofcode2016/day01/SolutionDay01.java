package com.mindhaq.adventofcode2016.day01;

import com.google.common.base.Splitter;
import com.google.common.io.Resources;
import org.slf4j.Logger;

import java.io.IOException;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.io.Resources.getResource;
import static org.slf4j.LoggerFactory.getLogger;

public class SolutionDay01 {

	public static void main(String... args) throws IOException {
		final Logger logger = getLogger(SolutionDay01.class);

		TaxiCabWalker taxiCabWalker = new TaxiCabWalker();
		String input = Resources.toString(getResource(SolutionDay01.class, "input.txt"), UTF_8);

		for (String instruction: Splitter.on(", ").trimResults().split(input)) {
			taxiCabWalker.walk(instruction);
		}

		logger.info("Distance to Easter Bunny HQ: {}", taxiCabWalker.getDistance());
		logger.info("Distance of first position visited twice: {}", taxiCabWalker.getDistanceOfFirstPositionVisitedTwice());
	}
}
