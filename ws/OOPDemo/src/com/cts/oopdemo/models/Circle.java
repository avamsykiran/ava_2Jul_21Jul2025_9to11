package com.cts.oopdemo.models;

public class Circle implements GeometricShape {
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}
