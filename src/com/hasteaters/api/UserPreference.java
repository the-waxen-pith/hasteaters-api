package com.hasteaters.api;

public class UserPreference {
	
	// preferences the user can input
	private String cuisine;
	private String food;
	private String restaurant;
	private String restriction;
	private String allergy;
	
	
	// constructors created 
	public UserPreference() {};
	
	// variables are assigned to the values passed into the object 
	// strings to allow JSON objects to be passed in
	public UserPreference(String cuisine, String food, String restaurant, String restriction, String allergy) {
		this.cuisine = cuisine;
		this.food = food;
		this.restaurant = restaurant;
		this.restriction = restriction;
		this.allergy = allergy; 
	}
	
	// getters setters - cuisine
	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	
	// getters setters - food type
	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
	// getters setters - restaurant type
	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	
	// getters setters - dietary restriction
	public String getRestriction() {
		return restriction;
	}

	public void setRestriction(String restriction) {
		this.restriction = restriction;
	}
	
	// getters setters - food allergy
	public String getAllergy() {
		return allergy;
	}

	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}

}
