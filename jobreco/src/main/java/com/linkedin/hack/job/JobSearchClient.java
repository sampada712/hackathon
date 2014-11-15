package com.linkedin.hack.job;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		Map<String, String[]> map = new HashMap<String, String[]>();
		map.put("Location", null);
		map.put("Experience", null);
		map.put("SKills", new String[] { "Java", "Html" });
		map.put("Connections", new String[] { "239"});
		jobs.add(new Job(
				"Netflix",
				"Los Gatos",
				"Senior Software Engineer/Architect - Billing Platform",
				"https://media.licdn.com/mpr/mpr/shrink_60_60/p/7/005/06b/147/32ef105.png",
				"Design a globally distributed, loosely coupled multi-region platform architecture in the cloud and ",
				85, 1, map));
		
		map = new HashMap<String, String[]>();
		map.put("Location", null);
		map.put("Experience", null);
		map.put("SKills", new String[] { "Java", "Database" });
		map.put("Connections", new String[] { "120"});
		jobs.add(new Job(
				"LinkedIn",
				"Sunnyvale, CA",
				"Senior Software Engineer",
				"http://media.glassdoor.com/sqls/34865/linkedin-squarelogo.png",
				"Perform ongoing database administration, maintenance, troubleshooting, tuning, installation",
				80, 1, map));
		
		map = new HashMap<String, String[]>();
		map.put("Location", null);
		map.put("Experience", null);
		map.put("SKills", new String[] { "Services", "Big Data" });
		map.put("Connections", new String[] { "50"});
		jobs.add(new Job(
				"Adobe",
				"San Jose, CA",
				"Senior Software Engineer",
				"http://media.glassdoor.com/sqls/1090/adobe-squarelogo-1412119969859.png",
				"Adobe is transforming its entire business to a subscription based revenue model",
				65, 4, map));
		
		map = new HashMap<String, String[]>();
		map.put("Experience", null);
		map.put("SKills", new String[] { "Services", "Java", "Architecture" });
		map.put("Connections", new String[] { "150"});
		jobs.add(new Job(
				"Salesforce",
				"San Francisco",
				"Principal Software Engineer or Software Architect",
				"https://media.licdn.com/media/p/7/005/098/1e1/1d04dff.png",
				"We are looking to hire both a Senior Software Engineer and a hands on coding Software Architect",
				50, 1, map));
		
		map = new HashMap<String, String[]>();
		map.put("Experience", null);
		map.put("SKills", new String[] { "Web Development", "Java"});
		map.put("Connections", new String[] { "45"});
		jobs.add(new Job(
				"Oracle",
				"Redwood City",
				"Principal Software Engineer",
				"http://media.glassdoor.com/sqls/1737/oracle-squarelogo.png",
				"This particular position exists within the team that builds the database used by Oracle Apps teams",
				45, 1, map));
	
		map = new HashMap<String, String[]>();
		map.put("Experience", null);
		map.put("SKills", new String[] { "Scalability", "Java"});
		map.put("Connections", new String[] { "5"});
		jobs.add(new Job(
				"Visa Inc.",
				"Foster City, CA",
				"Software Developer - Java - UI",
				"http://media.glassdoor.com/sqls/3035/visa-inc-squarelogo-1390952155205.png",
				"Visa Inc. is a global payments technology company that connects consumers, businessesF",
				30, 3, map));

		return jobs;
	}

	public List<Job> getRecommendedJobsForProfile(String profileId) {
		return getRecommendedJobsBasedOnCriteria(new JobCriteria());
	}

}
