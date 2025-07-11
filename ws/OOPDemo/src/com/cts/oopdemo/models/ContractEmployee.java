package com.cts.oopdemo.models;

public class ContractEmployee extends Employee {

	private int duration;

	public ContractEmployee() {

	}

	public ContractEmployee(int empId, String fullName, double salary, int duration) {
		super(empId, fullName, salary);
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return super.toString() + ", duration=" + duration;
	}

}
