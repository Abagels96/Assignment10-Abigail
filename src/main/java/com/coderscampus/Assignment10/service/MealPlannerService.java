package com.coderscampus.Assignment10.service;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.DTO.DayResponse;
import com.coderscampus.Assignment10.DTO.WeekResponse;

@Service
public class MealPlannerService {

	@Value("${api.key}")
	private String apiKey;
	
	 
	public ResponseEntity<DayResponse> callSpoonacularDayApi(String diet,  String exclude,  String targetCalories) {
 String value= "day";
 URI uriDay= buildUri(exclude,diet,targetCalories,value);
		
		RestTemplate rt1 = new RestTemplate();

		ResponseEntity<DayResponse> responseDay = rt1.getForEntity(uriDay, DayResponse.class);
		System.out.println(responseDay.getBody());
		return responseDay;
	}

	public ResponseEntity<WeekResponse> callSpoonacularWeekApi( String exclude, String diet, String targetCalories) {
String value="week";
		URI uriWeek = buildUri(exclude, diet, targetCalories,value);
		RestTemplate rt1 = new RestTemplate();
		ResponseEntity<WeekResponse> responseWeek = rt1.getForEntity(uriWeek, WeekResponse.class);
		System.out.println(responseWeek.getBody());
		return responseWeek;

	}

	public URI buildUri(String exclude, String diet, String targetCalories, String timeFrame) {
		return UriComponentsBuilder.newInstance().scheme("https").host("api.spoonacular.com")
				.path("/mealplanner/generate").queryParam("timeFrame", "value").queryParam("diet",Optional.ofNullable (diet))
				.queryParam("exclude", Optional.ofNullable(exclude)).queryParam("targetCalories", Optional.ofNullable(targetCalories))
				.queryParam("apiKey", apiKey).build().toUri();
	}

}
