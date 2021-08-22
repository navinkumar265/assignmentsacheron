package com.picnicapp.service;

import com.picnicapp.exception.SpotNotFoundException;
import com.picnicapp.spot.PicnicSpot;

public interface PicnicServie {
	PicnicSpot getById(int id) throws SpotNotFoundException;

	PicnicSpot[] getAll();

	PicnicSpot[] getBySpot(String spotname) throws SpotNotFoundException;

}
