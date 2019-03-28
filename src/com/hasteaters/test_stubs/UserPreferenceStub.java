package com.hasteaters.test_stubs;

import com.hasteaters.api.UserPreference;

// Stubs the user preferences retrieved from the preferences DB

public class UserPreferenceStub extends UserPreference {

	String cuisine = "Moroccan";
	String food = "Pasta";
	String restaurant = "Paesano";
	String restriction = "Vegetarian";
	String allergy = "Peanuts";
	UserPreference preferenceObject = new UserPreference(cuisine, food, restaurant, restriction, allergy);
	
	@Override
	public String getCuisine() {
		String stubCuisine = preferenceObject.getCuisine();
		return stubCuisine;
	}

	@Override
	public String getFood() {
		String stubFood = preferenceObject.getFood();
		return stubFood;
	}
	
	@Override
	public String getRestaurant() {
		String stubRestaurant = preferenceObject.getRestaurant();
		return stubRestaurant;
	}
	
	@Override
	public String getRestriction() {
		String stubRestriction = preferenceObject.getRestriction();
		return stubRestriction;
	}
	
	@Override
	public String getAllergy() {
		String stubAllergy = preferenceObject.getAllergy();
		return stubAllergy;
	}
	
}
