package com.hasteaters.api;

public class GpsLocation {
	
	// info to be passed to GetRecommendation third party
	private String userLocation;
	private int distanceInMiles;

	// constructors created
	public GpsLocation() {};
	
	// variables are assigned to the values passed into the object
	// values passed in from maps API
	public GpsLocation(String userLocation, int distanceInMiles) {
		this.userLocation = userLocation;
		this.distanceInMiles = distanceInMiles;
	}

	// getters setters - user location
	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	// getters setters - user distance in miles
	public int getDistanceInMiles() {
		return distanceInMiles;
	}
	
	public void setDistanceInMiles(int distanceInMiles) {
		this.distanceInMiles = distanceInMiles;
	}
	
}