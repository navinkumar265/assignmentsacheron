package com.shristi.vehicle;

public class Car extends Vehicle {

	public Car() {
		super("benz", 1000);
		// TODO Auto-generated constructor stub

	}

	void internal() {
		System.out.println("in car class for internal method");
	}

	void external() {
		System.out.println("in car class for external method");
	}

	void getMilage() {
		System.out.println("in car class to get milage");
	}

}
