package com.cts.oopdemo;

import java.util.Scanner;

public class App06StringDemo {

	public static void main(String[] args) {
		Scanner kbin = new Scanner(System.in);
		
		
		System.out.println("Any String? ");
		String s = kbin.next();
		
/*		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev += s.charAt(i);
		}
	*/
		
		//String rev = new StringBuilder(s).reverse().toString();
		
		StringBuilder sb= new StringBuilder(s);
		sb = sb.reverse();
		String rev = sb.toString();
		
		System.out.println(rev);
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("It is a pallendrome");
		}else {
			System.out.println("It is not a pallendrome");
		}
		
		kbin.close();

	}

}
