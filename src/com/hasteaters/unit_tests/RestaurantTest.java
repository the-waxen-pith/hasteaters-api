package com.hasteaters.unit_tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.hasteaters.api.Restaurant;

// Test the Restaurant methods in isolation

class RestaurantTest {

	@Test
	public void testGetName() {
		String expectedResult = "McDonald's";
		Restaurant actualResult = new Restaurant("McDonald's", "Glasgow", 10);
		assertEquals(expectedResult, actualResult.getName());
	}

	@Test
	public void testGetLocation() {
		String expectedResult = "Hamilton";
		Restaurant actualResult = new Restaurant("Subway", "Hamilton", 6);
		assertEquals(expectedResult, actualResult.getLocation());
	}
	
	@Test
	public void testGetWaitTimeInMinutes() {
		int expectedResult = 17;
		Restaurant actualResult = new Restaurant("Frankie & Benny's", "Edinburgh", 17);
		assertEquals(expectedResult, actualResult.getWaitTimeInMinutes());
	}
	
}
