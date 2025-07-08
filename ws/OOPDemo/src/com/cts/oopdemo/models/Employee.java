package com.cts.oopdemo.models;

public class Employee {

	private int empId;
	private String fullName;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int empId, String fullName, double salary) {	
		this.empId = empId;
		this.fullName = fullName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "empId=" + empId + ", fullName=" + fullName + ", salary=" + salary;
	}

	
}
