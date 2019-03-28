package com.hasteaters.api;

public class Restaurant  {

	// info passed retrieved from GetRecommendation third party
	// private variables to abstract details in the abstract factory "RecommendationFactory" 
	private String name;
	private String location;
	private int waitTimeInMinutes;
	
	// constructors created
	public Restaurant() {};
	
	// variables are assigned to values passed into object 
	// name, location, wait time from GetRecommendation
	public Restaurant(String name, String location, int waitTimeInMinutes) {
		this.name = name;
		this.location = location;
		this.waitTimeInMinutes = waitTimeInMinutes;
	}

	// getters setters - restaurant name 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// getters setters - restaurant location
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	// getters setters - estimated wait time
	public int getWaitTimeInMinutes() {
		return waitTimeInMinutes;
	}

	public void setWaitTimeInMinutes(int waitTimeInMinutes) {
		this.waitTimeInMinutes = waitTimeInMinutes;
	}
	
}