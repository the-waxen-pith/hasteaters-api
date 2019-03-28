package com.hasteaters.test_stubs;

import com.hasteaters.api.Recommendation;
import com.hasteaters.api.Restaurant;

public class RecommendationFactoryStub implements Recommendation {
	
	public String name = "Tim Horton's";
	public String location = "Hamilton";
	public int waitTimeInMinutes = 10;
	
	
	public Restaurant getRecommendation() {
		Restaurant recommendation = new Restaurant(name, location, waitTimeInMinutes);
		return recommendation;
	}
}
