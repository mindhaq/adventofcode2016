package com.mindhaq.adventofcode2016.day01;

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
}
