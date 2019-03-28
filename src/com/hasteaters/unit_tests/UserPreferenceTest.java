package com.hasteaters.unit_tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.hasteaters.api.UserPreference;

// Tests the UserPreference methods in isolation

class UserPreferenceTest {
	
	@Test
	public void testGetCuisine() {
		String expectedResult = "Chinese";
		UserPreference actualResult = new UserPreference("Chinese", "Hot Dogs", "McDonald's", "None", "None");
		assertEquals(expectedResult, actualResult.getCuisine());
	}

	@Test
	public void testGetFood() {
		String expectedResult = "Burgers";
		UserPreference actualResult = new UserPreference("Indian", "Burgers", "Subway", "Pescetarian", "None");
		assertEquals(expectedResult, actualResult.getFood());
	}
	
	@Test
	public void testGetRestaurant() {
		String expectedResult = "TGI Fridays";
		UserPreference actualResult = new UserPreference("Thai", "Sandwiches", "TGI Fridays", "Vegetarian", "Eggs");
		assertEquals(expectedResult, actualResult.getRestaurant());
	}
	
	@Test
	public void testGetRestriction() {
		String expectedResult = "Vegan";
		UserPreference actualResult = new UserPreference("American", "Cakes", "Gregg's", "Vegan", "Garlic");
		assertEquals(expectedResult, actualResult.getRestriction());
	}
	
	@Test
	public void testGetAllergy() {
		String expectedResult = "Peanuts";
		UserPreference actualResult = new UserPreference("Italian", "Chips", "Burger King", "None", "Peanuts");
		assertEquals(expectedResult, actualResult.getAllergy());
	}
		
}
