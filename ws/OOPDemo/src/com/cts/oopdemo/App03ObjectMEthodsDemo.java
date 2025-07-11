package com.cts.oopdemo;

import com.cts.oopdemo.models.ComplexNumber;

public class App03ObjectMEthodsDemo {

	public static void main(String[] args) {
		
		ComplexNumber z1 = new ComplexNumber(10,9);
		ComplexNumber z2 = new ComplexNumber(10,9);
		ComplexNumber z3 = z1;
		
		System.out.println(z1 + "\tHashcode: " + z1.hashCode() + "\tNativeHashcode: " + System.identityHashCode(z1));
		System.out.println(z2 + "\tHashcode: " + z2.hashCode() + "\tNativeHashcode: " + System.identityHashCode(z2));
		System.out.println(z3 + "\tHashcode: " + z3.hashCode() + "\tNativeHashcode: " + System.identityHashCode(z3));
	}
}
