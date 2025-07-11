package com.cts.oopdemo;

import java.util.Random;
import java.util.Scanner;

public class App07GuessMeIfYouCan {

	public static void main(String[] args) {
		
		Scanner kbin = new Scanner(System.in);
		
		Random random = new Random();
		
		boolean shallContinue = true;
		
		while(shallContinue){
		
			int n = random.nextInt(100);
			
			for(int i=1;i<=10;i++) {
				System.out.println("Guess What Am I Hiding? ");
				int guess = kbin.nextInt();
				
				if(guess==n) {
					System.out.println("YOU WON BY " + i + " CHANCES");
					break;
				}else if(guess<n) {
					System.out.println("IT CAN BE LARGER");
				}else {
					System.out.println("IT CAN BE SMALLER");
				}
			}
			
			System.out.println("Do you wanna continue? (yes/no): ");
			String concern = kbin.next().toLowerCase();
			
			shallContinue = concern.equals("yes");
		}
		
		kbin.close();

	}

}
