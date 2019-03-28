package com.hasteaters.api;

import com.hasteaters.api.Restaurant;

// Facade pattern
// Recommendation interface presents recommendation to UI without exposing the code
// No changes needed to the interface in the event of variables added / removed in Restaurant class

public interface Recommendation {

	Restaurant getRecommendation();
	
}
