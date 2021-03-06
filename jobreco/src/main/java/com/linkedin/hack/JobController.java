package com.linkedin.hack;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.linkedin.hack.job.Job;
import com.linkedin.hack.job.JobSearchClient;

/**
 * Handles requests for the application home page.
 */
@Controller
public class JobController {

	private static final Logger logger = LoggerFactory
			.getLogger(JobController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/jobs/{profileId}", method = RequestMethod.GET)
	public @ResponseBody
	List<Job> getRecommendedJobs(@PathVariable String profileId, Locale locale,
			Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return JobSearchClient.getInstance().getRecommendedJobsForProfile(
				profileId);
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/listjobs/{profileId}", method = RequestMethod.GET)
	public String getAllRecommendedJobs(@PathVariable String profileId,
			Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		List<Job> jobs = JobSearchClient.getInstance()
				.getRecommendedJobsForProfile(profileId);

		model.addAttribute("jobs", jobs);
		return "listjobs";
	}
}
