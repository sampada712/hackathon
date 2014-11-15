package com.linkedin.hack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class JobSearchClient {

	private RestTemplate restTemplate;
	@Value("https://api.linkedin.com/v1/job-search")
	private String baseUrl;

}
