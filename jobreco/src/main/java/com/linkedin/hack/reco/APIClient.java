package com.linkedin.hack.reco;

import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.LinkedInApi;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

public class APIClient {

	private OAuthService getService() {
		return new ServiceBuilder().provider(LinkedInApi.class)
				.apiKey("igfxoojhisoy").apiSecret("Vc9OURhfaNdMFWLi").build();
	}

	private Token getToken() {
		return new Token("733bb4ed-c932-48ed-9564-8edb0e54b2f4",
				"8b5aa80f-d922-43b6-9006-a82fb0c147da");
	}

	public String getJobs(String country) {
		// http://api.linkedin.com/v1/job-search:(jobs,facets)?facet=location,us:84
		OAuthRequest request = new OAuthRequest(
				Verb.GET,
				"http://api.linkedin.com/v1/job-search:(jobs,facets)?facet=location,us:84?format=json");
		getService().signRequest(getToken(), request);
		Response response = request.send();
		return response.getBody();
	}

	public String searchProfiles(String fname, String lname, String prevEmp,
			String currentEmp) {
		String url = String
				.format("https://api.linkedin.com/v1/people-search?first-name=%s&last-name=%s&company-name=%s&current-company=%s&sort=connections",
						fname, lname, prevEmp, currentEmp);

		OAuthRequest request = new OAuthRequest(Verb.GET, url);
		getService().signRequest(getToken(), request);
		Response response = request.send();
		return response.getBody();
	}

	public String getProfileData(String id) {
		OAuthRequest request = new OAuthRequest(
				Verb.GET,
				"http://api.linkedin.com/v1/people/id="
						+ id
						+ ":(id,first-name,last-name,industry,positions,site-standard-profile-request,skills,educations)?format=json");
		getService().signRequest(getToken(), request);
		Response response = request.send();
		return response.getBody();
	}
	
	public String getCompaniesFollowed(String id) {
		OAuthRequest request = new OAuthRequest(
				Verb.GET,
				"http://api.linkedin.com/v1/people/id="
						+ id
						+ "/following/companies");
		getService().signRequest(getToken(), request);
		Response response = request.send();
		return response.getBody();
	}
	

	public static void main(String[] args) {
		APIClient lc = new APIClient();

	/*	String jobs = lc.getJobs("us");
		System.out.println(jobs);*/

		
		 /*String search = lc.search("anu", "vemuri", "", "");
		 System.out.println(search);
		 */
		
/*		 String memberDetails = lc.getProfileData("LVoFYo5QHJ");
		 System.out.println(memberDetails);*/
		
		 String memberDetails = lc.getCompaniesFollowed("LVoFYo5QHJ");
		 System.out.println(memberDetails);
		 
		 
		 

	}
}
