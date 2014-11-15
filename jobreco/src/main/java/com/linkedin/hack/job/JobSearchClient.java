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
			instance = new JobSearchClient();
		}
		return instance;
	}

	@Value("https://api.linkedin.com/v1/job-search")
	private String baseUrl;

	public List<Job> getRecommendedJobsBasedOnCriteria(JobCriteria criteria) {
		List<Job> jobs = new ArrayList<Job>();
		jobs.add(new Job(
				"LinkedIn",
				"Sunnyvale, CA",
				"Senior Software Engineer",
				"http://media.glassdoor.com/sqls/34865/linkedin-squarelogo.png",
				"Perform ongoing database administration, maintenance, troubleshooting, tuning, installation, backup/recovery, and data migration of Oracle databases",
				20, 1));
		jobs.add(new Job(
				"Ebay Inc",
				"San Jose, CA",
				"Senior Java developer (tech lead)",
				"http://media.glassdoor.com/sqls/7853/ebay-squarelogo-1373559983203.png",
				"Make recommendations on new product features. Job Requirements The successful candidate should have",
				40, 2));
		jobs.add(new Job(
				"Visa Inc.",
				"Foster City, CA",
				"Software Developer - Java - UI",
				"http://media.glassdoor.com/sqls/3035/visa-inc-squarelogo-1390952155205.png",
				"Visa Inc. is a global payments technology company that connects consumers, businesses, financial institutions and governments in more than",
				30, 3));
		jobs.add(new Job(
				"Adobe",
				"San Jose, CA",
				"Senior Software Engineer",
				"http://media.glassdoor.com/sqls/1090/adobe-squarelogo-1412119969859.png",
				"Adobe is transforming its entire business to a subscription based revenue model. We, the Foundational Services Organization, are at the center of",
				50, 4));

		return jobs;
	}

	public List<Job> getRecommendedJobsForProfile(String profileId) {
		return getRecommendedJobsBasedOnCriteria(new JobCriteria());
	}

}
