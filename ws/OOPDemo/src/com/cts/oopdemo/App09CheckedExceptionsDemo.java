package com.cts.oopdemo;

import java.util.Scanner;

import com.cts.oopdemo.exceptions.InsufficientBalanceException;
import com.cts.oopdemo.exceptions.InvalidAmount;
import com.cts.oopdemo.models.BankAccount;
import com.cts.oopdemo.services.BankingService;

public class App09CheckedExceptionsDemo {
	static Scanner kbin;
	static BankAccount acc;
	static BankingService bankingService;

	public static void main(String[] args) {

		kbin = new Scanner(System.in);

		acc = new BankAccount(5000);
		
		bankingService = new BankingService();

		boolean shallContinue = true;

		while (shallContinue) {
			System.out.println("Command (Withdraw/Deposite/Quit)? ");
			String cmd = kbin.next().toLowerCase();

			switch (cmd) {
			case "withdraw":
				doWithdraw();
				break;
			case "deposite":
				doDeposite();
				break;
			case "quit":
				System.out.println("Bye! Visit Again");
				shallContinue = false;
				break;
			default:
				System.out.println("UnKnown Command");
			}
		}

		kbin.close();

	}

	private static void doDeposite() {
		System.out.println("Amount: ");
		double amt = kbin.nextDouble();
		try {
			bankingService.deposite(amt, acc);
			System.out.println("After Depositing Bal: " + acc.getCurrentBalance());
		} catch (InvalidAmount e) {
			System.out.println(e.getMessage());
		}
	}

	private static void doWithdraw() {
		System.out.println("Amount: ");
		double amt = kbin.nextDouble();
		try {
			bankingService.withdraw(amt, acc);
			System.out.println("After Withdrawal Bal: " + acc.getCurrentBalance());
		} catch (InvalidAmount | InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
