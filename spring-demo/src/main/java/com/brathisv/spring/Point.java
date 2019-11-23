package com.brathisv.spring;

/**
 * @author surya
 *
 */
public class Point {

	private int x, y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void initialize() {
		System.out.println("Point "+this.toString());
	}
}
