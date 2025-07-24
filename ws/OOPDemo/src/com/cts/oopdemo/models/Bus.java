package com.cts.oopdemo.models;

public class Bus {

	private int lastAllotedSeat;
	private int capacity;
	
	public Bus(int capacity) {
		this.capacity=capacity;
		this.lastAllotedSeat=0;
	}

	public int getLastAllotedSeat() {
		return lastAllotedSeat;
	}

	public void setLastAllotedSeat(int lastAllotedSeat) {
		this.lastAllotedSeat = lastAllotedSeat;
	}

	public int getCapacity() {
		return capacity;
	}
	
	public boolean isFull() {
		return lastAllotedSeat==capacity;
	}
	
	public boolean isASeatAvailable() {
		return lastAllotedSeat<capacity;
	}
}
