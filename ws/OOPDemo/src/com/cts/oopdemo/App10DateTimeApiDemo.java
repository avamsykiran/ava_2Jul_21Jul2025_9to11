package com.cts.oopdemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App10DateTimeApiDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		ZonedDateTime currentDateTimeInNewYork = ZonedDateTime.now(ZoneId.of("GMT-4"));
		System.out.println(currentDateTimeInNewYork);
		
		Scanner kbin = new Scanner(System.in);
		
		System.out.println("Dob (dd-MM-yyyy)? ");
		String dobStr = kbin.next();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate dob = LocalDate.parse(dobStr, dtf);
		
		Period age = Period.between(dob, today);
		System.out.println("Your exact age is: "+age);
		
		kbin.close();
		
	}

}
