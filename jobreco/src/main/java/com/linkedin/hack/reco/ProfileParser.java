package com.linkedin.hack.reco;

import com.google.gson.Gson;

public class ProfileParser {
	
	public static Profile getProfileDetails(String name) {
	  
	  Gson gson = new Gson();
	  Profile profile = null;
      try {
        profile = gson.fromJson(name, Profile.class);
   
      } catch (Exception e) {
         e.printStackTrace();
      }
      return profile;
	}
}
