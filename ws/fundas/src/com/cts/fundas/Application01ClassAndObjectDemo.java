package com.cts.fundas;

public class Application01ClassAndObjectDemo {

	public static void main(String[] args) {
		ComplexNumber z1 = new ComplexNumber();
		ComplexNumber z2 = new ComplexNumber(10,9);
		ComplexNumber z3 = new ComplexNumber(7,-9);
		ComplexNumber z4 = new ComplexNumber(z2);
		ComplexNumber z5 = z2;
		
		System.out.println(z1.hashCode() + "\t" + z1.getReal() + "\t" + z1.getImg());
		System.out.println(z2.hashCode() + "\t" + z2.getReal() + "\t" + z2.getImg());
		System.out.println(z3.hashCode() + "\t" + z3.getReal() + "\t" + z3.getImg());
		System.out.println(z4.hashCode() + "\t" + z4.getReal() + "\t" + z4.getImg());
		System.out.println(z5.hashCode() + "\t" + z5.getReal() + "\t" + z5.getImg());
		
	}

}
