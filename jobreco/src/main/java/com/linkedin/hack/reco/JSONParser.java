package com.linkedin.hack.reco;

import com.google.gson.Gson;
import com.linkedin.hack.reco.pojo.profile.Profile;
import com.linkedin.hack.reco.pojo.search.SearchResults;

public class JSONParser {

	public static SearchResults getSearchResults(String data) {

		Gson gson = new Gson();
		SearchResults searchResults = null;
		try {
			searchResults = gson.fromJson(data, SearchResults.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchResults;
	}

	public static Profile getProfile(String data) {

		Gson gson = new Gson();
		Profile profile = null;
		try {
			profile = gson.fromJson(data, Profile.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return profile;
	}
}
