package com.linkedin.hack.reco.pojo.search;

public class SearchResults {
	private String numResults;

	private People people;

	public String getNumResults() {
		return numResults;
	}

	public void setNumResults(String numResults) {
		this.numResults = numResults;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}
}