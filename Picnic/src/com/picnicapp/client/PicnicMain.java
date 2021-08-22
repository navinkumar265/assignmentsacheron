package com.picnicapp.client;

import java.util.Scanner;

import com.picnicapp.exception.SpotNotFoundException;
import com.picnicapp.service.PicnicServiceImpl;
import com.picnicapp.spot.PicnicSpot;

public class PicnicMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PicnicSpot[] spot = new PicnicSpot[5];
		PicnicSpot nspot;
		PicnicServiceImpl picnicservice = new PicnicServiceImpl();
		System.out.println("choose option\n1.to display all\n2.to search by spot\n3.to search by spot id");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			spot = picnicservice.getAll();

			for (PicnicSpot picnicspot : spot) {
				System.out.println("spot id "+picnicspot.getSpotid());
				System.out.println("spot name "+picnicspot.getSpotname());
				System.out.println("food "+picnicspot.getFood());
				System.out.println("rating "+picnicspot.getRating());
				System.out.println();
			}
			break;
		case 2:
			System.out.println("enter spot name to search");
			String spotname = sc.next();
			try {
				spot = picnicservice.getBySpot(spotname);
				for (PicnicSpot picnicspot : spot) {
					if (picnicspot != null) {
						System.out.println("spot id "+picnicspot.getSpotid());
						System.out.println("spot name "+picnicspot.getSpotname());
						System.out.println("food "+picnicspot.getFood());
						System.out.println("rating "+picnicspot.getRating());
						System.out.println();
					} else
						break;
				}

			} catch (SpotNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.out.println("enter spot name to search");
			int id = sc.nextInt();
			try {
				nspot = picnicservice.getById(id);
				System.out.println("spot name "+nspot.getSpotname());
				System.out.println("food "+nspot.getFood());
				System.out.println("rating "+nspot.getRating());
				System.out.println();

			} catch (SpotNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		default:
			System.out.println("invaild choice");
		}

	}

}
