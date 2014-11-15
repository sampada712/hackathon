package com.linkedin.hack.job;

public class Job {

	public Job(String companyName, String jobTitle, String location,
			long JobId) {
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.location = location;
		this.JobId = JobId;

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
}
