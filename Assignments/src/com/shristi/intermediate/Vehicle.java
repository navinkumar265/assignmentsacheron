package com.shristi.intermediate;

public class Vehicle {

	String name, model;
	int price;

	Vehicle(String n, String m, int p) {
		name = n;
		model = m;
		price = p;
	}

	void getDetails() {
		System.out.println("name " + name + "\nmodel " + model + "\nprice " + price);
	}
}
