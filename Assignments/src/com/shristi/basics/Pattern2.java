package com.shristi.basics;

public class Pattern2 {
	public static void main(String[] args) {
		// even numbers upto 20
		System.out.println("even numbers");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}

		// odd numbers upto 20
		System.out.println("odd numbers");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}
	}

}
