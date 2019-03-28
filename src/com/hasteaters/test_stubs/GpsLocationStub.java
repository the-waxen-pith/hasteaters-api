package com.hasteaters.test_stubs;

import com.hasteaters.api.GpsLocation;

// Stubs the GPS data being retrieved from Google Maps API

public class GpsLocationStub extends GpsLocation {

	String userLocation = "Motherwell";
	int distanceInMiles = 5;
	GpsLocation gpsObject = new GpsLocation(userLocation, distanceInMiles);
	
	@Override
	public String getUserLocation() {
		String gpsUserLocation = gpsObject.getUserLocation();
		return gpsUserLocation;
		
	}

	@Override
	public int getDistanceInMiles() {
		int gpsDistanceInMiles = gpsObject.getDistanceInMiles();
		return gpsDistanceInMiles;

	}

}
