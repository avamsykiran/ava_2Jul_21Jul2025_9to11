package com.cts.oopdemo.models;

public class Director extends Manager {
	private double share;
	
	public Director() {
		
	}

	public Director(int empId, String fullName, double salary, double allowence, double share) {
		super(empId, fullName, salary, allowence);
		this.share = share;
	}

	public double getShare() {
		return share;
	}

	public void setShare(double share) {
		this.share = share;
	}

	@Override
	public String toString() {
		return super.toString() +  ", share=" + share;
	}
		
}
