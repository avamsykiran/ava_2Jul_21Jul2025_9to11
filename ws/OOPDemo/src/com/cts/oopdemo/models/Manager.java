package com.cts.oopdemo.models;

public class Manager extends Employee {
	
	private double allowence;
	
	public Manager() {
		
	}

	public Manager(int empId, String fullName, double salary, double allowence) {
		super(empId, fullName, salary);
		this.allowence = allowence;
	}

	public double getAllowence() {
		return allowence;
	}

	public void setAllowence(double allowence) {
		this.allowence = allowence;
	}

	@Override
	public String toString() {
		return super.toString() + ", allowence=" + allowence ; 
	}
		
}
