package com.shristi.vehicle;

public abstract class Vehicle extends Accessories {

	String model;
	double price;

	public Vehicle(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}

	abstract void getMilage();

	void getDetails() {
		System.out.println("in vehicle model and price " + model + " " + price);
	}

}
