package com.shristi.basics;

public class Pattern1 {
	public static void main(String[] args) {

		// greatest and smallest in an array

		int arr[] = new int[] { 100, 20, 1, 555, 92 };

		int max = arr[0];
		for (int i = 1; i < 5; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		int min = arr[0];
		for (int i = 1; i < 5; i++) {
			if (min > arr[i])
				min = arr[i];
		}

		System.out.println("greatest in an array " + max + "\nsmallest in array " + min);

	}
}
