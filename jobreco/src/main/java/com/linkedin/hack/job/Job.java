package com.linkedin.hack.job;

public class Job {

	public Job(String companyName, String location, String jobTitle,
			String companyLogo, String jobDesc, int rating, long JobId) {
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.location = location;
		this.JobId = JobId;
		this.companyLogo = companyLogo;
		this.jobDesc = jobDesc;
		this.rating = rating;
	}

	String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getJobId() {
		return JobId;
	}

	public void setJobId(long jobId) {
		JobId = jobId;
	}

	String jobTitle;
	String location;
	long JobId;

	public String getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	String companyLogo;
	String jobDesc;
	int rating;
}
