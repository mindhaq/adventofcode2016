package com.mindhaq.adventofcode2016.day01;

import com.google.common.base.Splitter;
import com.google.common.io.Resources;

import java.io.IOException;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.io.Resources.getResource;

public class Solution {

	public static void main(String... args) throws IOException {

		TaxiCabWalker taxiCabWalker = new TaxiCabWalker();

		String input = Resources.toString(getResource(Solution.class, "input.txt"), UTF_8);

		for (String instruction: Splitter.on(", ").trimResults().split(input)) {
			taxiCabWalker.walk(instruction);
		}

		System.out.println("Distance to Easter Bunny HQ: " + taxiCabWalker.getDistance());
	}
}
