package com.brathisv.spring;

public class Triangle {

	private String type;
	
	private Point point1;
	private Point point2;
	private Point point3;
	
	public String getType() {
		return type;
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " triangle is drawn with :: "+ point1 + point2 + point3);
	}
}
