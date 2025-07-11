package com.cts.oopdemo;

import com.cts.oopdemo.models.Circle;
import com.cts.oopdemo.models.Rectangle;

public class App02InterfaceDemo {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(10,10);
		Circle c = new Circle(10.0);
		
		double paintingRate = 90;
		
		System.out.println(r.estimatePaintingCost(paintingRate));
		System.out.println(c.estimatePaintingCost(paintingRate));

	}

}
