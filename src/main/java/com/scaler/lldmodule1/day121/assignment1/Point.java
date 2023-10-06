package com.scaler.lldmodule1.day121.assignment1;

import java.util.Objects;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point point = (Point) obj;
			return this.x == point.x && this.y == point.y;
		}

		return false;
	}

}
