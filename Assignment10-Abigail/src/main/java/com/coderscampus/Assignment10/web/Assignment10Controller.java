package com.coderscampus.Assignment10.web;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.DTO.DayResponse;
import com.coderscampus.Assignment10.DTO.WeekResponse;
import com.coderscampus.Assignment10.service.Assignment10Service;
import com.fasterxml.jackson.annotation.JsonProperty;

@RestController
public class Assignment10Controller {
	@Autowired
	Assignment10Service service;

	@JsonProperty("exclude")
	String exclusions = null;
	@JsonProperty("targetCalories")
	String numCalories = null;
	String diet = null;

	@GetMapping("mealplanner/week{numCalories}{diet}{exclusions}")

	public ResponseEntity<WeekResponse> getWeekMeals(@PathVariable String numCalories, @PathVariable String diet,
			@PathVariable String exclusions) {

		ResponseEntity<WeekResponse> week = service.callSpoonacularWeekApi();

		return week;
	}

	@GetMapping("mealplanner/day{numCalories}{diet}{exclusions}")

	public ResponseEntity<DayResponse> getDayMeals(@PathVariable String numCalories, @PathVariable String diet,
			@PathVariable String exclusions) {

		ResponseEntity<DayResponse> day = service.callSpoonacularDayApi();
		return day;
	}

}
