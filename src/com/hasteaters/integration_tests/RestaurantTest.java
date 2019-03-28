package com.hasteaters.integration_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hasteaters.test_stubs.RestaurantStub;

// Restaurant data is stubbed to test integration with GetRecommendation third-party
// Expected results are defined in RestaurantStub

class RestaurantTest {

	@Test
	public void testGetName() {
		String expectedResult = "La Vita";
		RestaurantStub actualResult = new RestaurantStub();
		assertEquals(expectedResult, actualResult.getName());
	}

	@Test
	public void testGetLocation() {
		String expectedResult = "Glasgow";
		RestaurantStub actualResult = new RestaurantStub();
		assertEquals(expectedResult, actualResult.getLocation());
	}
	
	@Test
	public void testGetWaitTimeInMinutes() {
		int expectedResult = 8;
		RestaurantStub actualResult = new RestaurantStub();
		assertEquals(expectedResult, actualResult.getWaitTimeInMinutes());
	}
	
}
