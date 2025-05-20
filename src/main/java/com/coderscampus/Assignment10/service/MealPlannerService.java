package com.coderscampus.Assignment10.service;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.DTO.DayResponse;
import com.coderscampus.Assignment10.DTO.WeekResponse;

@Service
public class MealPlannerService {

	public ResponseEntity<DayResponse> callSpoonacularDayApi() {

		URI uriDay = UriComponentsBuilder.newInstance().scheme("https").host("api.spoonacular.com")
				.path("/mealplanner/generate").queryParam("timeFrame", "day").queryParam("diet", "")
				.queryParam("exclude", "").queryParam("targetCalories", 2000)
				.queryParam("apiKey", "26da184289a34f92b8c8562015a8d1d3").build().toUri();

		RestTemplate rt1 = new RestTemplate();

		ResponseEntity<DayResponse> responseDay = rt1.getForEntity(uriDay, DayResponse.class);

		System.out.println(responseDay.getBody());
		return responseDay;
	}

	public ResponseEntity<WeekResponse> callSpoonacularWeekApi() {

		URI uriWeek = UriComponentsBuilder.newInstance().scheme("https")

				.host("api.spoonacular.com").path("/mealplanner/generate").queryParam("timeFrame", "week")
				.queryParam("diet", "").queryParam("exclude", "").queryParam("targetCalories",14000)
				.queryParam("apiKey", "26da184289a34f92b8c8562015a8d1d3").build().toUri();
		RestTemplate rt1 = new RestTemplate();
		ResponseEntity<WeekResponse> responseWeek = rt1.getForEntity(uriWeek, WeekResponse.class);
		System.out.println(responseWeek.getBody());
		return responseWeek;

	}

}
