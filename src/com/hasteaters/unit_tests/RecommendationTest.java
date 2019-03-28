package com.hasteaters.unit_tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.hasteaters.api.Restaurant;

// Tests the Recommendation interface "getRecommendation" method in isolation
// getName, getLocation, getWaitTimeInMinutes inherited from Restaurant class

class RecommendationTest {

	@Test
	public void testGetRecommendation() {
		
		Restaurant expectedResult = new Restaurant("Paesano", "Glasgow", 15);
		Restaurant actualResult = new Restaurant("Paesano", "Glasgow", 15);
		
		assertEquals(expectedResult.getName(), actualResult.getName());
		assertEquals(expectedResult.getLocation(), actualResult.getLocation());
		assertEquals(expectedResult.getWaitTimeInMinutes(), actualResult.getWaitTimeInMinutes());
	
	}

}
