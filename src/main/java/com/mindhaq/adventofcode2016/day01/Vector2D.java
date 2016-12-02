package com.mindhaq.adventofcode2016.day01;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import static java.lang.Math.abs;

public class Vector2D {
	public final int x;

	public final int y;

	public Vector2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Vector2D add(Vector2D v2) {
		return new Vector2D(x + v2.x, y + v2.y);
	}

	public int getTaxiCabDistance() {
		return abs(x) + abs(y);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Vector2D vector2D = (Vector2D) o;
		return x == vector2D.x &&
				y == vector2D.y;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(x, y);
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("x", x)
				.add("y", y)
				.toString();
	}
}
