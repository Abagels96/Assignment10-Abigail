package com.coderscampus.Assignment10.service;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.DTO.DayResponse;
import com.coderscampus.Assignment10.DTO.WeekResponse;
@Service 
public class Assignment10Service {
	
	public ResponseEntity<DayResponse> callSpoonacularDayApi() {
		
		

		
		
	URI uriDay =	UriComponentsBuilder.newInstance()
			                         .scheme("https")
			                         .host("api.spoonacular.com")
			                        .path("/mealplanner/generate")
			                        .queryParam("timeFrame", "day")
			                        .queryParam("targetCalories", "0")
			                        .queryParam("diet", "null")
			                        .queryParam("exclude","")
			                        .queryParam("apiKey", "26da184289a34f92b8c8562015a8d1d3")
			                        .build()
			                        .toUri();

		RestTemplate rt1= new RestTemplate();
		
		
	ResponseEntity<DayResponse> responseDay=	rt1.getForEntity(uriDay, DayResponse.class);
	
	System.out.println(responseDay.getBody());
	return responseDay;
	}
	
	
	public ResponseEntity<WeekResponse> callSpoonacularWeekApi() {
		
	URI uriWeek =	UriComponentsBuilder.newInstance()
			.scheme("https")

			.host("api.spoonacular.com")
	.path("/mealplanner/generate")
			.queryParam("timeFrame", "week")
			.queryParam("targetCalories", "14000")
			.queryParam("diet", "paleo")
			.queryParam("exclude","shrimp,black olives,mushrooms")
	.queryParam("apiKey", "26da184289a34f92b8c8562015a8d1d3")
			.build()
			.toUri();
	RestTemplate rt1= new RestTemplate();
	ResponseEntity<WeekResponse> responseWeek= rt1.getForEntity(uriWeek, WeekResponse.class);
	System.out.println(responseWeek.getBody());
	return responseWeek;
		
	}
	
	}
	// Psuedo code the end goal is to make meal plans with the api
	//First I need to request the data from the API with a request 
	// then I need to map that data into an Java object then use those 
	//objects in the controller to filter them with maps