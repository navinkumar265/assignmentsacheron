package com.shristi.basics;

import java.util.Scanner;

public class Basics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.Find the greatest of three numbers using ternary operator . Give values
		// directly
		int a = 1000, b = 2000, c = 3000;
		int temp = a > b ? a : b;
		int result = c > temp ? c : temp;
		System.out.println("greatest number is " + result);

	}

}
