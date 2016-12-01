package com.mindhaq.adventofcode2016.day01;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public final class Vector2DMatchers {
	private Vector2DMatchers() {}

	public static Matcher<Vector2D> hasX(Matcher<Integer> matcher) {
		return new FeatureMatcher<Vector2D, Integer>(matcher, "x", "x") {
			@Override
			protected Integer featureValueOf(Vector2D actual) {
				return actual.x;
			}
		};
	}

	public static Matcher<Vector2D> hasY(Matcher<Integer> matcher) {
		return new FeatureMatcher<Vector2D, Integer>(matcher, "y", "y") {
			@Override
			protected Integer featureValueOf(Vector2D actual) {
				return actual.y;
			}
		};
	}

}
