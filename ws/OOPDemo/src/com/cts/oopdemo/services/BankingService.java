package com.cts.oopdemo.services;

import com.cts.oopdemo.exceptions.InsufficientBalanceException;
import com.cts.oopdemo.exceptions.InvalidAmount;
import com.cts.oopdemo.models.BankAccount;

public class BankingService {

	public void withdraw(double amount, BankAccount acc) throws InvalidAmount, InsufficientBalanceException {

		if(amount<0) {
			throw new InvalidAmount("Can not withdraw negative amount");
		}
		
		if(acc!=null) {
			if(acc.getCurrentBalance()<amount) {
				throw new InsufficientBalanceException("CAn not withdraw "+amount+" as the balance is "+acc.getCurrentBalance());
			}
			
			acc.setCurrentBalance(acc.getCurrentBalance()-amount);
		}
	}

	public void deposite(double amount, BankAccount acc) throws InvalidAmount {
		if(amount<0) {
			throw new InvalidAmount("Can not deposite negative amount");
		}
		
		if(acc!=null) {			
			acc.setCurrentBalance(acc.getCurrentBalance()+amount);
		}
	}
}
