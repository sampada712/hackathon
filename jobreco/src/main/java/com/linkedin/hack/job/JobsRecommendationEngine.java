package com.linkedin.hack.job;

import com.linkedin.hack.reco.APIClient;
import com.linkedin.hack.reco.pojo.profile.Profile;

public class JobsRecommendationEngine {

	public JobCriteria buildJobCriteria(String profileId) {
		Profile profileDetails = APIClient.getInstance().getProfileData(
				profileId);
		JobCriteria criteria = new JobCriteria();
		criteria.setIndustry(profileDetails.getIndustry());
		// criteria.setSkills(profileDetails.getSkills().getValues().);
		return criteria;
	}

	public void matchJobsForProfile(String profileId) {
		JobCriteria criteria = buildJobCriteria(profileId);
		JobSearchClient.getInstance().getRecommendedJobsBasedOnCriteria(
				criteria);
		// TODO-- Store job details in DB
	}
}
