package com.cts.oopdemo.models;

public interface GeometricShape {
	double getPerimeter();

	double getArea();

	public default double estimatePaintingCost(double paintingRate) {
		return getArea() * paintingRate;
	}
}