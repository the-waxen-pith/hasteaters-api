package com.hasteaters.integration_tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.hasteaters.test_stubs.UserPreferenceStub;

// UserPreference data is stubbed to test integration
// Expected results are defined in UserPreferenceStub
// Simulates data retrieved from the HastEaters user preferences database

class UserPreferenceTest {
	
	@Test
	public void testGetCuisine() {
		String expectedResult = "Moroccan";
		UserPreferenceStub actualResult = new UserPreferenceStub();
		assertEquals(expectedResult, actualResult.getCuisine());
	}

	@Test
	public void testGetFood() {
		String expectedResult = "Pasta";
		UserPreferenceStub actualResult = new UserPreferenceStub();
		assertEquals(expectedResult, actualResult.getFood());
	}
	
	@Test
	public void testGetRestaurant() {
		String expectedResult = "Paesano";
		UserPreferenceStub actualResult = new UserPreferenceStub();
		assertEquals(expectedResult, actualResult.getRestaurant());
	}
	
	@Test
	public void testGetRestriction() {
		String expectedResult = "Vegetarian";
		UserPreferenceStub actualResult = new UserPreferenceStub();
		assertEquals(expectedResult, actualResult.getRestriction());
	}
	
	@Test
	public void testGetAllergy() {
		String expectedResult = "Peanuts";
		UserPreferenceStub actualResult = new UserPreferenceStub();
		assertEquals(expectedResult, actualResult.getAllergy());
	}
		
}
