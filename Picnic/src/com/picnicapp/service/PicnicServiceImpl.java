package com.picnicapp.service;

import com.picnicapp.exception.SpotNotFoundException;
import com.picnicapp.spot.PicnicSpot;

public class PicnicServiceImpl implements PicnicServie {

	@Override
	public PicnicSpot getById(int id) throws SpotNotFoundException {

		boolean flag = false;
		PicnicSpot npicnic = null;
		for (PicnicSpot spot : allSpots()) {
			if (spot.getSpotid() == id) {
				flag = true;
				npicnic = spot;
			}
		}
		if (flag == false) {
			throw new SpotNotFoundException("invaild id");
		}
		return npicnic;
	}

	@Override
	public PicnicSpot[] getAll() {
		// TODO Auto-generated method stub
		return allSpots();
	}

	@Override
	public PicnicSpot[] getBySpot(String spotname) throws SpotNotFoundException {
		PicnicSpot[] npicnic = new PicnicSpot[5];
		boolean flag = false;
		int i = 0;
		for (PicnicSpot spot : allSpots()) {
			if (spot.getSpotname().equals(spotname)) {
				flag = true;
				npicnic[i] = spot;
				i++;
			}
		}
		if (flag == false) {
			throw new SpotNotFoundException("invaild spot");
		}
		return npicnic;

	}

	private PicnicSpot[] allSpots() {
		PicnicSpot[] picnic = new PicnicSpot[5];
		picnic[0] = new PicnicSpot("Chennai", "dosa", 4.5, 1);
		picnic[1] = new PicnicSpot("Pondicherry", "fish briyani", 4.3, 2);
		picnic[2] = new PicnicSpot("Bangalore", "pav baji", 4.9, 3);
		picnic[3] = new PicnicSpot("Delhi", "chappathi", 4.1, 4);
		picnic[4] = new PicnicSpot("Hyderabad", "HYb briyani", 4, 5);

		return picnic;

	}

}
