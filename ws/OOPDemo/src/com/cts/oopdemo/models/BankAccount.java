package com.cts.oopdemo.models;

public class BankAccount {

	private double currentBalance;

	public BankAccount(double currentBalance) {
		super();
		this.currentBalance = currentBalance;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	
}
