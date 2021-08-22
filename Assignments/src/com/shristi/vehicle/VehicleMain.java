package com.shristi.vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accessories a = new Car();
		a.internal();
		a.external();

		Vehicle v = (Vehicle) a;
		v.getMilage();
		v.getDetails();
	}

}
