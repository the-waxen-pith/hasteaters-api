package com.hasteaters.integration_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.hasteaters.api.GpsLocation;
import com.hasteaters.test_stubs.GpsLocationStub;

// GpsLocation data is stubbed to test integration with maps API
// Expected results are defined in GpsLocationStub

class GpsLocationTest {

	public GpsLocation gps;
	
	@Before
	public void setUp() {
		gps = new GpsLocationStub();
	}
	
	@Test
	public void testGetUserLocation() {
		String expectedResult = "Motherwell";
		GpsLocationStub actualResult = new GpsLocationStub();
		assertEquals(expectedResult, actualResult.getUserLocation());
	}

	@Test
	public void testGetUserDistanceInMiles() {
		int expectedResult = 5;
		GpsLocationStub actualResult = new GpsLocationStub();
		assertEquals(expectedResult, actualResult.getDistanceInMiles());
	}

}
