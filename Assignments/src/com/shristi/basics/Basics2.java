package com.shristi.basics;

public class Basics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2.Find the smallest of three numbers using short circuit AND. Use Scanner to
		// get user input
		int x = 1000, y = 200, z = 3000;
		String results = (x < y) && (x < z) ? "x is smaller" : (y < z) ? "y is smaller" : "z is smaller";
		System.out.println(results);
	}

}
