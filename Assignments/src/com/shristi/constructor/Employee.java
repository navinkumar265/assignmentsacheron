package com.shristi.constructor;

public class Employee {

	String name, designation;

	Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}

	double calBonus(double basicAllowance) {
		double bonus = basicAllowance * (8.33 / 100);
		return bonus;
	}

	double calBonus(double basicAllowance, double carAllowance) {
		double bonus = basicAllowance + carAllowance * (8.33 / 100);
		return bonus;
	}

	double calBonus(double basicAllowance, double carAllowance, double homeAllowance) {
		double bonus = basicAllowance + carAllowance + homeAllowance * (8.33 / 100);
		return bonus;
	}

	void getDetails(double bonus) {
		System.out.println("name " + name + "\ndesignation " + designation + "\nbonus " + bonus);
	}
}
