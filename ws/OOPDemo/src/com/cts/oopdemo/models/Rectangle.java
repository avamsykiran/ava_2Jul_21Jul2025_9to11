package com.cts.oopdemo.models;

public class Rectangle implements GeometricShape {
	private int length;
	private int breadth;
		
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getPerimeter() {
		return 2 * (length + breadth);
	}

	public double getArea() {
		return length * breadth;
	}
}