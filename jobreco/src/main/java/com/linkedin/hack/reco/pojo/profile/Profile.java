package com.linkedin.hack.reco.pojo.profile;

import com.linkedin.hack.reco.pojo.education.Educations;
import com.linkedin.hack.reco.pojo.position.Positions;
import com.linkedin.hack.reco.pojo.skill.Skills;


public class Profile {
	private Skills skills;

	private String id;

	private Positions positions;

	private String lastName;

	private SiteStandardProfileRequest siteStandardProfileRequest;

	private Educations educations;

	private String industry;

	private String firstName;

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Positions getPositions() {
		return positions;
	}

	public void setPositions(Positions positions) {
		this.positions = positions;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public SiteStandardProfileRequest getSiteStandardProfileRequest() {
		return siteStandardProfileRequest;
	}

	public void setSiteStandardProfileRequest(
			SiteStandardProfileRequest siteStandardProfileRequest) {
		this.siteStandardProfileRequest = siteStandardProfileRequest;
	}

	public Educations getEducations() {
		return educations;
	}

	public void setEducations(Educations educations) {
		this.educations = educations;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}