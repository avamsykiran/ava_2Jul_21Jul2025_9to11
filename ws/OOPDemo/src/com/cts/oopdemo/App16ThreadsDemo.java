package com.cts.oopdemo;

import com.cts.oopdemo.models.Bus;
import com.cts.oopdemo.services.BookingService;

public class App16ThreadsDemo {

	public static void main(String[] args) {

		Bus b1 = new Bus(25);
		Bus b2 = new Bus(25);
		Bus b3 = new Bus(25);
		
		BookingService bs1 = new BookingService(b1, 10);
		BookingService bs2 = new BookingService(b2, 15);
		BookingService bs3 = new BookingService(b3, 5);
		
		Thread th1 = new Thread(bs1, "Service1 ");
		Thread th2 = new Thread(bs2, "Service2 ");
		Thread th3 = new Thread(bs3, "Service3 ");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			th1.join();
			th2.join();
			th3.join();			
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
		
		System.out.println(bs1.getSeatsAlloted());
		System.out.println(bs2.getSeatsAlloted());
		System.out.println(bs3.getSeatsAlloted());
	}

}
