package com.hasteaters.api;

import com.hasteaters.api.Recommendation;
import com.hasteaters.api.Restaurant;

// Abstract factory method
// Sole responsibility is creating recommendation objects to be presented to the UI
// No changes needed to the abstract factory in the event of variables added / removed in Restaurant class

public class RecommendationFactory implements Recommendation {
	
	public Restaurant getRecommendation() {
		Restaurant recommendation = new Restaurant();
		return recommendation;	
	}
}
