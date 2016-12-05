package com.mindhaq.adventofcode2016.day02;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class Key {

	private final String code;

	private Key left;

	private Key up;

	private Key right;

	private Key down;

	public Key(String code) {
		this.code = code;
	}

	public Key getLeft() {
		return left;
	}

	public void setLeft(Key left) {
		this.left = left;
		if (left != this && left.getRight() != this) {
			left.setRight(this);
		}
	}

	public Key getUp() {
		return up;
	}

	public void setUp(Key up) {
		this.up = up;
		if (up != this && up.getDown() == null) {
			up.setDown(this);
		}
	}

	public Key getRight() {
		return right;
	}

	public void setRight(Key right) {
		this.right = right;
		if (right != this && right.getLeft() == null) {
			right.setLeft(this);
		}
	}

	public Key getDown() {
		return down;
	}

	public void setDown(Key down) {
		this.down = down;
		if (down != this && down.getUp() == null) {
			down.setUp(this);
		}
	}

	public String getCode() {
		return code;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("code", code)
				.toString();
	}
}
