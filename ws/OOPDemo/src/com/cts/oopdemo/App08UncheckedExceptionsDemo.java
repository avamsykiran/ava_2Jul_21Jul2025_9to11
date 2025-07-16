package com.cts.oopdemo;

import java.util.Scanner;

public class App08UncheckedExceptionsDemo {
	
	static Scanner kbin;

	public static void main(String[] args) {
		
		kbin = new Scanner(System.in);
				
		int n1 = readInt("A Number: ");
		int n2 = readInt("Another Number: ");
	
		if(n2!=0) {
			System.out.println("Qut: "+ (n1/n2));
		}else {
			System.out.println("Can not divide by 0");
		}
		
		System.out.println("ThanQ");
		
		kbin.close();

	}

	private static int readInt(String prompt) {
		System.out.println(prompt);
		while(!kbin.hasNextInt()) {
			kbin.next();
			System.out.println(prompt);
		}
		return kbin.nextInt();
	}
}
