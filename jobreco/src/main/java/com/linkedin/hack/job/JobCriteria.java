package com.linkedin.hack.job;

public class JobCriteria {

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public int getExpInYears() {
		return expInYears;
	}

	public void setExpInYears(int expInYears) {
		this.expInYears = expInYears;
	}

	public String[] getPrevCompanies() {
		return prevCompanies;
	}

	public void setPrevCompanies(String[] prevCompanies) {
		this.prevCompanies = prevCompanies;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String[] getFollowedCompanies() {
		return followedCompanies;
	}

	public void setFollowedCompanies(String[] followedCompanies) {
		this.followedCompanies = followedCompanies;
	}

	String location;
	String education;
	int expInYears;
	String[] prevCompanies;
	String[] skills;
	String industry;
	String[] followedCompanies;

}
