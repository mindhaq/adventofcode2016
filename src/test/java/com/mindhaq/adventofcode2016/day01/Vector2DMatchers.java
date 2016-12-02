package com.mindhaq.adventofcode2016.day01;

import org.hamcrest.Description;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeDiagnosingMatcher;

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

	public static Matcher<Vector2D> isVectorAt(final int x, final int y) {
		return new TypeSafeDiagnosingMatcher<Vector2D>() {
			@Override
			protected boolean matchesSafely(Vector2D item, Description mismatchDescription) {
				mismatchDescription.appendValue(item);
				return item.x == x && item.y == y;
			}

			@Override
			public void describeTo(Description description) {
				description.appendValue("Vector2D at x=" + x + ", y=" + y);
			}
		};
	}

}
