package com.hasteaters.test_stubs;

import com.hasteaters.api.Restaurant;

// Stubs the GPS data being retrieved from Google Maps API

public class RestaurantStub extends Restaurant {

	String name = "La Vita";
	String location = "Glasgow";
	int waitTimeInMinutes = 8;
	Restaurant restaurantObject = new Restaurant(name, location, waitTimeInMinutes);
	
	@Override
	public String getName() {
		String stubName = restaurantObject.getName();
		return stubName;
	}

	@Override
	public String getLocation() {
		String stubLocation = restaurantObject.getLocation();
		return stubLocation;
	}
	
	@Override
	public int getWaitTimeInMinutes() {
		int stubWaitTime = restaurantObject.getWaitTimeInMinutes();
		return stubWaitTime;	
	}

}