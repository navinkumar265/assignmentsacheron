package com.shristi.basics;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pattern 1 22 333 444

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(i);
			System.out.println();
		}

		// pattern 1 23 456 789
		int k = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}

	}

}
