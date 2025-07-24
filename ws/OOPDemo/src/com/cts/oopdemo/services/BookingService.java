package com.cts.oopdemo.services;

import java.util.ArrayList;
import java.util.List;

import com.cts.oopdemo.models.Bus;

public class BookingService implements Runnable {

	private Bus bus;
	private int requriedSeats;
	private List<Integer> seatsAlloted;

	public BookingService(Bus bus, int requriedSeats) {
		super();
		this.bus = bus;
		this.requriedSeats = requriedSeats;
		this.seatsAlloted = new ArrayList<>();
	}

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + ">> Please wait while reserving seats...");
		for (int i = 1; i <= requriedSeats; i++) {
			synchronized (bus) {
				if (bus.isASeatAvailable()) {
					int seat = bus.getLastAllotedSeat() + 1;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					seatsAlloted.add(seat);
					bus.setLastAllotedSeat(seat);
				} else {
					break;
				}
			}
		}
		System.out.println(t.getName() + ">> Task Accomplished");
	}

	public List<Integer> getSeatsAlloted() {
		return seatsAlloted;
	}

}
