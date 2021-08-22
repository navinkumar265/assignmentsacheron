package com.picnicapp.spot;

public class PicnicSpot {

	String spotname, food;
	int spotid;
	double rating;

	public PicnicSpot(String spotname, String food, double rating, int spotid) {
		super();
		this.spotname = spotname;
		this.food = food;
		this.rating = rating;
		this.spotid = spotid;
	}

	public String getSpotname() {
		return spotname;
	}

	public void setSpotname(String spotname) {
		this.spotname = spotname;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getSpotid() {
		return spotid;
	}

	public void setSpotid(int spotid) {
		this.spotid = spotid;
	}
}
