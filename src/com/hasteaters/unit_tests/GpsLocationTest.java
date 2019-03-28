package com.hasteaters.unit_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hasteaters.api.GpsLocation;

// Test the GpsLocation methods in isolation

class GpsLocationTest {
	
	@Test
	public void testGetUserLocation() {
		String expectedResult = "Glasgow";
		GpsLocation actualResult = new GpsLocation("Glasgow", 3);
		assertEquals(expectedResult, actualResult.getUserLocation());
	}

	@Test
	public void testGetUserDistanceInMiles() {
		int expectedResult = 6;
		GpsLocation actualResult = new GpsLocation("Edinburgh", 6);
		assertEquals(expectedResult, actualResult.getDistanceInMiles());
	}

}
