package com.cts.fundas;

public class ComplexNumber {

	private int real;
	private int img;
	
	public ComplexNumber() {
		
	}	
	
	public ComplexNumber(int real, int img) {
		this.real = real;
		this.img = img;
	}
	
	public ComplexNumber(ComplexNumber z) {
		this(z.real,z.img);
	}

	public int getReal() {
		return real;
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public int getImg() {
		return img;
	}
	
	public void setImg(int img) {
		this.img = img;
	}
	
	
}
