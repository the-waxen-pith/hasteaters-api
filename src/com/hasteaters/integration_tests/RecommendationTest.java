package com.hasteaters.integration_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import com.hasteaters.api.Recommendation;
import com.hasteaters.api.Restaurant;
import com.hasteaters.test_stubs.RecommendationFactoryStub;

// RecommendationFactory and Restaurant data is stubbed to test integrations
// Test shows how Recommendation Interface; getRecommendation method can be called to present recommendations to the UI
// Expected results are defined in RecommendationFactoryStub
// Simulates data passed from GetRecommendation third-party

public class RecommendationTest {

	public Recommendation factory;
	
	// set up the stub
	@Before
	public void setUp() {
		factory = new RecommendationFactoryStub();
	}
	
	@Test
	public void testGetRecommendation() {
		Restaurant expectedResult = new Restaurant("Tim Horton's", "Hamilton", 10);
		Restaurant actualResult = factory.getRecommendation();
		assertEquals(expectedResult.getName(), actualResult.getName());
		assertEquals(expectedResult.getLocation(), actualResult.getLocation());
		assertEquals(expectedResult.getWaitTimeInMinutes(), actualResult.getWaitTimeInMinutes());
	}
}

