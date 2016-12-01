package com.mindhaq.adventofcode2016.day01;

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
}
