package com.linkedin.hack.reco.pojo.profile.position;


public class Values {
	private String id;

	private StartDate startDate;

	private String title;

	private Company company;

	private EndDate endDate;

	private String isCurrent;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public StartDate getStartDate() {
		return startDate;
	}

	public void setStartDate(StartDate startDate) {
		this.startDate = startDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public EndDate getEndDate() {
		return endDate;
	}

	public void setEndDate(EndDate endDate) {
		this.endDate = endDate;
	}

	public String getIsCurrent() {
		return isCurrent;
	}

	public void setIsCurrent(String isCurrent) {
		this.isCurrent = isCurrent;
	}
}