package com.shristi.intermediate;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		// 3.

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		System.out.println("name of the student");
		String name = sc.nextLine();
		System.out.println("id");
		int id = sc.nextInt();
		System.out.println("3 sub marks");
		for (int i = 0; i < 3; i++)
			arr[i] = sc.nextInt();

		Student s1 = new Student(name, id, arr);
		s1.getGrades();
		s1.getDetails();
	}

}
