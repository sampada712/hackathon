package com.linkedin.hack.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class JobSearchClient {

	private JobSearchClient() {

	}

	private static JobSearchClient instance;

	public static JobSearchClient getInstance() {
		if (instance == null) {
            instance =  new JobSearchClient();
		}
		return instance;
	}

	@Value("https://api.linkedin.com/v1/job-search")
	private String baseUrl;

	public List<Job> getRecommendedJobsBasedOnCriteria(JobCriteria criteria) {
		List<Job> jobs = new ArrayList<Job>();
		jobs.add(new Job("LinkedIn", "Sunnyvale, CA",
				"Senior Software Engineer", 1));
		jobs.add(new Job("Ebay Inc", "San Jose, CA",
				"Senior Java developer (tech lead)", 2));
		jobs.add(new Job("Visa Inc.", "Foster City, CA",
				"Software Developer - Java - UI", 3));
		jobs.add(new Job("Twitter Inc", "San Fransisco, CA",
				"Cassandra Resource", 4));

		return jobs;
	}

	public List<Job> getRecommendedJobsForProfile(String profileId) {
		return getRecommendedJobsBasedOnCriteria(new JobCriteria());
	}

}
