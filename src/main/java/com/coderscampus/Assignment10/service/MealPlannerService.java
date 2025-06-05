package com.coderscampus.Assignment10.service;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.DTO.DayResponse;
import com.coderscampus.Assignment10.DTO.WeekResponse;

@Service
public class MealPlannerService {

	@Value("${api.key}")
	private String apiKey;

	public ResponseEntity<DayResponse> callSpoonacularDayApi(String diet, String exclude,
			@RequestParam(required = false) String targetCalories) {
		URI uriDay = buildUri(exclude, diet, targetCalories, "day");

		RestTemplate rt1 = new RestTemplate();

		ResponseEntity<DayResponse> responseDay = rt1.getForEntity(uriDay, DayResponse.class);
		System.out.println(responseDay.getBody());
		return responseDay;
	}

	public ResponseEntity<WeekResponse> callSpoonacularWeekApi(String exclude, String diet, String targetCalories) {
		URI uriWeek = buildUri(exclude, diet, targetCalories, "week");
		RestTemplate rt1 = new RestTemplate();
		ResponseEntity<WeekResponse> responseWeek = rt1.getForEntity(uriWeek, WeekResponse.class);
		System.out.println(responseWeek.getBody());
		return responseWeek;

	}

	public URI buildUri(String exclude, String diet, String targetCalories, String timeFrame) {
		UriComponentsBuilder builder = UriComponentsBuilder.newInstance().scheme("https").host("api.spoonacular.com")
				.path("/mealplanner/generate").queryParam("timeFrame", timeFrame)
				.queryParam("apiKey", apiKey);

		Optional.ofNullable(diet).filter(s -> !s.isBlank()).ifPresent(d -> builder.queryParam("diet", diet));

		Optional.ofNullable(exclude).filter(s -> !s.isBlank()).ifPresent(d -> builder.queryParam("exclude", exclude));

		Optional.ofNullable(targetCalories).filter(s -> !s.isBlank())
				.ifPresent(d -> builder.queryParam("targetCalories", targetCalories));

		return builder.build().toUri();

	}
}
